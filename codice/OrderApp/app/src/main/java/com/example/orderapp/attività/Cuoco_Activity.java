package com.example.orderapp.attività;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.orderapp.R;


public class Cuoco_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuoco);

        Button buttonBack2= findViewById(R.id.buttonBack2);
        Button buttonVisualizzaOrdine = findViewById(R.id.buttonVisualizzaOrdine);

        //PULSANTE INDIETRO

        buttonBack2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        //PULSANTE VISUALIZZA ORDINE

        buttonVisualizzaOrdine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiaVisualizzaOrdine();
            }
        });
    }

    //PULSANTE VISUALIZZA ORDINE

    private void cambiaVisualizzaOrdine(){
        Intent intent=new Intent(this,visualizza_ordine.class);
        startActivity(intent);           //visualizzo schermata per vedere un ordine
    }
}
