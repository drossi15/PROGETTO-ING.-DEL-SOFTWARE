package com.example.orderapp.attività;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.orderapp.R;
import com.example.orderapp.database.ConnectionHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class visualizza_prenotazione extends AppCompatActivity {
    private ConnectionHelper db1= new ConnectionHelper();
     Connection con1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizza_prenotazione);

        final ArrayList <String> listp=new ArrayList<String>();
        final ListView mylistP=(ListView) findViewById(R.id.ListaPrenotazioni);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listp);

        con1=db1.connectionDB();
        if (con1 != null) {
            try {
                Statement statement = con1.createStatement();
                ResultSet resultSet = statement.executeQuery("Select * from PRENOTAZIONE");   //ESEGUO LA QUERY
                while (resultSet.next()) {                                                      //PER OGNI TUPLA CREO UNA STRINGA
                    String s=new String();
                    String y= new String();
                    for(int i=1;i<=6;i++){
                        y=resultSet.getString(i);
                        s=s+"   "+y;

                    }
                    listp.add(s);                                          //SALVA LA STRINGA IN UNA LISTA


                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        mylistP.setAdapter(adapter);                      //STAMPO LA LISTA SULLA UI



    }


}