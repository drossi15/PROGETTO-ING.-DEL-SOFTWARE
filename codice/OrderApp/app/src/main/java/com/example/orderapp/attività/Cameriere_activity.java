package com.example.orderapp.attività;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.orderapp.R;


public class Cameriere_activity  extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cameriere);

        Button buttonBack1= findViewById(R.id.buttonBack1);
        Button buttonNuovaPrenotazione=findViewById(R.id.buttonNuovaPrenotazione);
        Button buttonNuovoOrdine = findViewById(R.id.NuovoOrdine);
        Button buttonVisualizzaPrenotazione = findViewById(R.id.VisualizzaPrenotazione);
        Button buttonVisualizzaOrdine = findViewById(R.id.VisualizzaOrdine);
        Button buttonCancPrenotazione = findViewById(R.id.buttonCancPrenotazione);

        //CONTROLLO PULSANTE "INDIETRO" ///////

        buttonBack1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        //PULSANTE NUOVA PRENOTAZIONE

        buttonNuovaPrenotazione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cambiaAttivitàPrenotazione();
            }
        });

        //PULSANTE NUOVO ORDINE

        buttonNuovoOrdine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cambiaAttivitàOrdine();
            }
        });

        //PULSANTE VISUALIZZA PRENOTAZIONE

        buttonVisualizzaPrenotazione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cambiaVisualizzaPrenotazione();
            }
        });

        //PULSANTE VISUALIZZA ORDINE

        buttonVisualizzaOrdine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cambiaVisualizzaOrdine();
            }
        });


        buttonCancPrenotazione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiaCancellaPrenotazione();
            }
        });
    }

    // VARI METODI CHE FANNO PARTITE LE VARIE ATTIVITA' COLLEGATE

    private void cambiaAttivitàPrenotazione(){
        Intent intent1=new Intent(this,nuovaprenotazione_activity.class);
        startActivity(intent1);      //visualizzo schermata per creare una prenotazione
    }
    private void cambiaAttivitàOrdine(){
        Intent intent=new Intent(this,nuovoordine.class);
        startActivity(intent);           //visualizzo schermata per creare un ordine
    }

    private void cambiaVisualizzaPrenotazione(){
        Intent intent=new Intent(this,visualizza_prenotazione.class);
        startActivity(intent);           //visualizzo schermata per vedere una prenotazione
    }


    private void cambiaVisualizzaOrdine(){
        Intent intent=new Intent(this,visualizza_ordine.class);
        startActivity(intent);           //visualizzo schermata per vedere un ordine

    }

    private void cambiaCancellaPrenotazione(){
        Intent intent = new Intent(this,cancella_prenotazione.class);
        startActivity(intent);
    }
}
