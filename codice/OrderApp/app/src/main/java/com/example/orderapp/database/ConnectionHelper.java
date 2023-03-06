package com.example.orderapp.database;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orderapp.R;
import com.example.orderapp.attività.visualizza_ordine;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionHelper  {

    private static String ip = "192.168.178.82";
    private static String port = "1433";
    private static String Classes = "net.sourceforge.jtds.jdbc.Driver";
    private static String database = "testDatabase";
    private static String username = "test";
    private static String password = "test";
    private static String url = "jdbc:jtds:sqlserver://" + ip + ":" + port + "/" + database;
    private  Connection connection = null;


    // METODO CHE CREA LA CONNESSIONE CON IL DATABASE

    public Connection connectionDB() {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        try {

            Class.forName(Classes);
            connection = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return connection;
    }

    //METODO PER L'INSERIMENTO DELLE PRENOTAZIONI NEL DATABASE

    public boolean Insert_prenotazione(String orario, String nome, String cellulare, int tavolo, Connection cn) {
        if (cn != null) {
            try {
                Statement statement = cn.createStatement();
                ResultSet resultSet = statement.executeQuery("Insert into PRENOTAZIONE (ORARIO,NOME,CELLULARE,NUMERO_TAVOLO)" +
                        "VALUES ('" + orario + "','" + nome + "','" + cellulare + "','" + tavolo + "')");
                return true;


            } catch (SQLException e) {
                e.printStackTrace();
                return false;

            }


        }
        return false;


    }

    //METODO PER CALCOLARE IL PREZZO DI UN ORDINE

    public double Calcola_prezzo(int quantità[],Connection cn){
        double totale=0;
        if (cn != null) {
            try {
                int i=0;
                Statement statement = cn.createStatement();
                ResultSet resultSet = statement.executeQuery("select PREZZO_PIATTO from PIATTO");
                while(resultSet.next()) {

                        double prezzo = resultSet.getDouble(1);
                        totale = totale + quantità[i] * prezzo;
                        i++;

                    }


            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
        return totale;

    }

    //METODO CHE MI RITORNA L' ID DELL' ULTIMO ORDINE INSERITO

    public int Ultimo_Ordine(Connection cn) {
        int u=0;
        if (cn!=null) {
            try {
                Statement statement4 = cn.createStatement();
                ResultSet resultSet4 = statement4.executeQuery("select ID_ORDINE" +
                        "from ORDINE" +
                        "where ID_ORDINE>=all(select ID_ORDINE" +
                        "from ORDINE)");
                u=resultSet4.getInt(1);

            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
        return u;

    }

   //METODO CHE INSERISCE GLI ORDINI NELLA TABELLA "CONTIENE" ( CHE PERMETTE DI COLLEGARE I PIATTI AGLI ORDINI)

    public void Insert_Contiene(int []quantità,int []id,Connection cn,int ultimo){
        if(cn!=null){
            for(int i=0;i<8;i++){
                if(quantità[i]>0) {
                    try {

                        Statement statement3 = cn.createStatement();
                        ResultSet resultSet3 = statement3.executeQuery("Insert into CONTIENE (ID_PIATTO,ID_ORDINE,QT)" +
                                "VALUES('" + id[i] + "','" + ultimo + "','" + quantità[i] + "')");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                }
            }
    }

    //METODO CHE INSERISCE GLI ORDINI NEL DATABASE

    public boolean Insert_Ordine(double prezzo, int tavolo, Connection cn) {
        if (cn != null) {
            try {
                Statement statement = cn.createStatement();
                ResultSet resultSet = statement.executeQuery("Insert into ORDINE (PREZZO_ORDINE,TAVOLO)" +
                        "VALUES ('" + prezzo + "','" + tavolo + "')");
                return true;


            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;

    }


}


