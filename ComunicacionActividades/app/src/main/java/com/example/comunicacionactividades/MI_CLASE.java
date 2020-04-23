package com.example.comunicacionactividades;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

class MI_CLASE extends AppCompatActivity {
    private EditText eFrase;
    private Button bAceptar,bCancelar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        eFrase=findViewById(R.id.editText0);
        recogerDatos(null);
    }

    private void recogerDatos(View v) {
        Bundle extras=getIntent().getExtras();
        String s="hola"+extras.getString("usuario")+",¿Aceptas la condiciones?";
        Log.e("Texto y usuario",s);
        eFrase.setText(s);

        bAceptar=findViewById(R.id.button1);
        bCancelar=findViewById(R.id.button2);

        bAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                devolverRespuesta("Aceptado");
            }
        });
        bCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                devolverRespuesta("Cancelar");
            }
        });


    }
    public void devolverRespuesta(String respuesta){
        Log.e("De vuelta",respuesta );

        Intent intent=new Intent();
        intent.putExtra("Resultado",respuesta);
        setResult(RESULT_OK,intent);
        finish();
    }


}
