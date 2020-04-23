package com.example.androidmikel;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class Actividad_Mikel extends AppCompatActivity {
    EditText nombre,apellido,ano;
    Button siguiente,volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_mikel);

        nombre=findViewById(R.id.editNombre);
        apellido=findViewById(R.id.editApellido);
        ano=findViewById(R.id.editAno);

        siguiente=findViewById(R.id.btnSiguiente);
        volver=findViewById(R.id.btnVolv);

        siguiente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "año "+urt, Toast.LENGTH_SHORT).show();
                if(nombre.length()>0 & apellido.length()>0 && ano.length()>0){
                    int urt=zenbat_urte(Integer.parseInt(ano.getText().toString()));
                    if(urt>=18){
                         siguientePantalla();
                    }else{
                        Toast.makeText(getApplicationContext(), "Eres menor de edad", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(), "Le falta algun dato por rellenar", Toast.LENGTH_SHORT).show();
                }
            }
        });
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public int zenbat_urte(int urte){
        Calendar fecha=Calendar.getInstance();
        int ano=fecha.get(Calendar.YEAR);
        int retorno=ano-urte;
        return retorno;
    }
    public void siguientePantalla(){

        Intent intent=new Intent(Actividad_Mikel.this,Actividad_Segunda_Mikel.class);
        intent.putExtra("nombre", nombre.getText().toString());
        intent.putExtra("apellido",apellido.getText().toString());
        startActivity(intent);

    }
    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1234){
            if (resultCode==RESULT_OK){
                Toast.makeText(getApplicationContext(), "Bien", Toast.LENGTH_SHORT).show();
            }
        }
    }*/
}
