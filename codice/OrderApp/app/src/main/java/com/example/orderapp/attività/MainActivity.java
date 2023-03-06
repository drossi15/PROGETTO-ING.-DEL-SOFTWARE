package com.example.orderapp.attività;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.orderapp.R;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate( Bundle savedInstanceState) {

         EditText eName;
        EditText ePassword;
         Button buttonLogin;



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = findViewById(R.id.username);
        ePassword = findViewById(R.id.password);
        buttonLogin = findViewById(R.id.button);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName = eName.getText().toString();      //leggo username
                String inputPassword = ePassword.getText().toString();     //leggo password

                if (inputName.isEmpty() || inputPassword.isEmpty()){

                    Toast.makeText(MainActivity.this, "Inserire Username e Password", Toast.LENGTH_SHORT).show();//campi username e password vuoti
                }else if (validate(inputName,inputPassword)) {     //verifico campi username e password
                    Toast.makeText(MainActivity.this, "Login effettuato", Toast.LENGTH_SHORT).show();   //se ok passo alla successiva pagina (activiy)
                    cambiaAttivitàHome();
                    //Intent intent2 = new Intent(MainActivity.this, Home_page.class);
                    //startActivity(intent2);
                }else {
                    Toast.makeText(MainActivity.this, "Username e/o Password non corretti", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
    private void cambiaAttivitàHome(){
        Intent intent=new Intent(this, Home_page.class);
        startActivity(intent);
    }


    public static boolean validate(String username, String password){

        if(username.equals("admin") && password.equals("foodapp1234")){
            return true;
        }else
            return false;

    }
}
