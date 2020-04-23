package com.example.comunicacionactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button botonVerificar;
    EditText nombre,eRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonVerificar = findViewById(R.id.button0);
        nombre=findViewById(R.id.editText0);
        eRes=findViewById(R.id.editText1);

        botonVerificar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mostrarNombre();
            }
        });
    }
    public void mostrarNombre(){

        final Intent intent=new Intent(this,MI_CLASE.class);

        intent.putExtra("usuario",nombre.getText().toString());
        startActivityForResult(intent,1234);

    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==1234 && resultCode== RESULT_OK){
            String res=data.getExtras().getString("resultado");
            eRes.setText(res);
        }
    }



}
