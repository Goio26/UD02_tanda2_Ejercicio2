package com.example.dm2.ud02_ejercicio2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textoD,textoL;
    private TextView etiqueta2;
    private Button bot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoD=findViewById(R.id.textoD);
        textoL=findViewById(R.id.textoL);
        bot=findViewById(R.id.bot);
        etiqueta2=findViewById(R.id.etiqueta2);


        final char letras[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dni,resul;
                String letra;

                dni=Integer.parseInt(textoD.getText()+"");
                letra=textoL.getText()+"";

                resul=dni%23;
                if(letra.charAt(0)==letras[resul]){
                        etiqueta2.setText("Resultado: Letra Correcta");

                }else{
                    etiqueta2.setText("Resultado: Letra Incorrecta");
                   
                }


            }
        });


    }
}
