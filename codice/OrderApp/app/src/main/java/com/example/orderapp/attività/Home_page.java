package com.example.orderapp.attività;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.orderapp.R;
import com.example.orderapp.database.ConnectionHelper;

import java.sql.Connection;


public class Home_page extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);



        Button buttonCameriere=findViewById(R.id.buttonCameriere);
        Button buttonCuoco=findViewById(R.id.buttonCuoco);

        //PULSANTE CAMERIERE

        buttonCameriere.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cambiaAttivitàCam();


            }
        });

        //PULSANTE CUOCO

        buttonCuoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiaAttivitàCuoco();
            }
        });
    }

    private void cambiaAttivitàCam(){
        Intent intent=new Intent(this, Cameriere_activity.class);
        startActivity(intent);
    }

    private void cambiaAttivitàCuoco(){
        Intent intent=new Intent(this, Cuoco_Activity.class);
        startActivity(intent);
    }


}

