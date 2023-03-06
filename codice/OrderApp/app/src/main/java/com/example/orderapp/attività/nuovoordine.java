package com.example.orderapp.attività;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orderapp.R;
import com.example.orderapp.database.ConnectionHelper;

import java.sql.Connection;

public class nuovoordine extends AppCompatActivity {

    public ConnectionHelper db3= new ConnectionHelper();
    Connection con3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuovoordine);
        TextView verifica=findViewById(R.id.textView5);
        TextView numPasta = findViewById(R.id.numPasta);
        TextView numRiso = findViewById(R.id.numRiso);
        TextView numCarne = findViewById(R.id.numCarne);
        TextView numPesce = findViewById(R.id.numPesce);
        TextView numPatatine = findViewById(R.id.numPatatine);
        TextView numInsalata = findViewById(R.id.numInsalata);
        TextView numAcqua = findViewById(R.id.numAcqua);
        TextView numVino = findViewById(R.id.numVino);
        Button conf=findViewById(R.id.buttonConferma);
        Button backButton = findViewById(R.id.backbutton);
        Button pastaMeno = findViewById(R.id.pastaMeno);
        Button pastaPiu = findViewById(R.id.pastaPiu);
        Button risoMeno = findViewById(R.id.risoMeno);
        Button risoPiu = findViewById(R.id.risoPiu);
        Button carneMeno = findViewById(R.id.carneMeno);
        Button carnePiu = findViewById(R.id.carnePiu);
        Button pesceMeno = findViewById(R.id.pesceMeno);
        Button pescePiu = findViewById(R.id.pescePiu);
        Button patatineMeno = findViewById(R.id.patatineMeno);
        Button patatinePiu = findViewById(R.id.patatinePiu);
        Button insalataMeno = findViewById(R.id.insalataMeno);
        Button insalataPiu = findViewById(R.id.insalataPiu);
        Button acquaMeno = findViewById(R.id.acquaMeno);
        Button acquaPiu = findViewById(R.id.acquaPiu);
        Button vinoMeno = findViewById(R.id.vinoMeno);
        Button vinoPiu = findViewById(R.id.vinoPiu);
        EditText tavolo=findViewById(R.id.numeroTavolo);
        int []id={1,2,3,4,5,6,7,8};

        con3=db3.connectionDB();

       // PULSANTI +/- PER DECIDIERE LA QUANTITAì DEI PRODOTTI

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        pastaMeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementa(numPasta);
            }
        });
        pastaPiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementa(numPasta);
            }
        });
        risoMeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementa(numRiso);
            }
        });
        risoPiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementa(numRiso);
            }
        });
        carneMeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementa(numCarne);
            }
        });
        carnePiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementa(numCarne);
            }
        });
        pesceMeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementa(numPesce);
            }
        });
        pescePiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementa(numPesce);
            }
        });
        patatineMeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementa(numPatatine);
            }
        });
        patatinePiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementa(numPatatine);
            }
        });
        insalataMeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementa(numInsalata);
            }
        });
        insalataPiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementa(numInsalata);
            }
        });
        acquaMeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementa(numAcqua);
            }
        });
        acquaPiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementa(numAcqua);
            }
        });
        vinoMeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementa(numVino);
            }
        });
        vinoPiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementa(numVino);
            }
        });

        //PULSANTE AGGIUNGI ORDINE

        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] qt={
                        Integer.parseInt(numPasta.getText().toString()),
                        Integer.parseInt(numRiso.getText().toString()),
                        Integer.parseInt(numCarne.getText().toString()),
                        Integer.parseInt(numPesce.getText().toString()),
                        Integer.parseInt(numPatatine.getText().toString()),
                        Integer.parseInt(numInsalata.getText().toString()),
                        Integer.parseInt(numAcqua.getText().toString()),
                        Integer.parseInt(numVino.getText().toString())};         // CREO UN VETTORE CON LE QUANTITA' DEI VARI PIATTI

                db3.Insert_Ordine(db3.Calcola_prezzo(qt,con3),Integer.parseInt(tavolo.getText().toString()),con3); // METODO INSERISCI ORDINE
                ConnectionHelper db4=new ConnectionHelper();
                int ultimo=db3.Ultimo_Ordine(db4.connectionDB());
                db3.Insert_Contiene(qt,id,db4.connectionDB(),ultimo);    //METODO INSERISCI CONTIENE

}
        });


    }

    //METODI CHE INCREMENTANO E DECREMENTANO IL VALORE DELLE TEXTVIEW DEI VARI PIATTI

    public static void incrementa(TextView v){
        String currentValue = v.getText().toString();
        int value = Integer.parseInt(currentValue);
        value++;
        v.setText(String.valueOf(value));
    }

    public void decrementa(TextView v){
        String currentValue = v.getText().toString();
        int value = Integer.parseInt(currentValue);
        value--;
        v.setText(String.valueOf(value));
    }

}