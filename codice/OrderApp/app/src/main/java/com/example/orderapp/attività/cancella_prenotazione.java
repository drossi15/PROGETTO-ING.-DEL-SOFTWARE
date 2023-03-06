package com.example.orderapp.attività;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.orderapp.R;

public class cancella_prenotazione extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancella_prenotazione);

        Button canc = findViewById(R.id.buttonCancellaPrenotazione);
        EditText numTavolo = findViewById(R.id.numTavolo);

        canc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancella(numTavolo);
            }
        });
    }

    private void cancella(EditText num) {  //prende in input il numero del tavolo corrispondente alla prenotazione da cancellare

    }
}

   // private boolean validate(){

        //if(/*cancellazione riuscita*/){
               /// Toast.makeText(this,"prenotazione cancellata", Toast.LENGTH_SHORT);
               //  return true;
       // }else //altrimenti
           // Toast.makeText(this,"errore, ripetere", Toast.LENGTH_SHORT);
           // return false;
    //    }


