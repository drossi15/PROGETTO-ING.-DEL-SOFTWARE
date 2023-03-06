package com.example.orderapp.attività;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.orderapp.R;
import com.example.orderapp.database.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class visualizza_ordine extends AppCompatActivity {

    private ConnectionHelper db = new ConnectionHelper();
    Connection con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizza_ordine);

        final ArrayList<String> listo=new ArrayList<String>();
        final ListView mylistO=(ListView) findViewById(R.id.ListaOrdini);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listo);
        con = db.connectionDB();
        if (con != null) {
            try {
                Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery("Select * from ORDINE");     //ESEGUO LA QUERY
                while (resultSet.next()) {                                               //PER OGNI TUPLA CREO UNA STRINGA

                    String s1=new String();
                    String y1= new String();
                    for(int i=1;i<=4;i++){
                        y1=resultSet.getString(i);                            //CONVERTO IL RISULTATO IN STRINGA
                        s1=s1+"          "+y1;                                //SOMMO LA STRINGA LLE STRINGHE DELLE ALTRE COLONNE

                    }
                    listo.add(s1);                                             //AGGIUNGO LA STRINGA A UNA LISTA




                }
            } catch (SQLException e) {
                e.printStackTrace();

            }

        }

        mylistO.setAdapter(adapter);                        //STAMPO LA LISTA SULLA UI


    }
}