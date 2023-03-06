package com.example.orderapp.attività;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

import com.example.orderapp.R;
import com.example.orderapp.database.ConnectionHelper;


import java.sql.Connection;

public  class nuovaprenotazione_activity extends AppCompatActivity {
    ConnectionHelper db2= new ConnectionHelper();
    Connection con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nuova_prenotazione);



        Button buttonAggiungi=findViewById(R.id.buttonAggiungi);
        EditText orario,nome,cellulare,tavolo ;
        orario=findViewById(R.id.editTextTextPersonName);
        nome=findViewById(R.id.editTextTextPersonName2);
        cellulare=findViewById(R.id.editTextTextPersonName3);
        tavolo=findViewById(R.id.editTextNumber);
        con=db2.connectionDB();

        // PULSANTE AGGIUNGI PRENOTAZIONE

        buttonAggiungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              db2.Insert_prenotazione(orario.getText().toString(),          // METODO INSERISCI PRENOTAZIONE
                                      nome.getText().toString(),
                                     cellulare.getText().toString(),
                      Integer.parseInt(tavolo.getText().toString()),con);
            }
        });

    }


}