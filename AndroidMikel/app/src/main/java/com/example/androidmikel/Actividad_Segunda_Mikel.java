package com.example.androidmikel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Actividad_Segunda_Mikel extends AppCompatActivity {
    RadioButton no,si;
    EditText ingresos;
    Button res,volver;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_segunda_mikel);

        no=findViewById(R.id.rdbNo);
        si=findViewById(R.id.rdbSi);

        ingresos=findViewById(R.id.editIngresos);

        res=findViewById(R.id.btnResolucion);
        volver=findViewById(R.id.btnVolve);

        Bundle ext=getIntent().getExtras();
        final String nom=ext.getString("nombre");
        final String ape=ext.getString("apellido");

        res.setOnClickListener(new View.OnClickListener() {
            boolean fam;
            double ingre;
            boolean evalua;
            @Override
            public void onClick(View v) {
                if((si.isChecked() || no.isChecked())&& ingresos.length()>0) {
                    ingre = Integer.parseInt(ingresos.getText().toString());
                    if (si.isChecked()) {
                        fam = true;
                    } else if(no.isChecked()) {
                        fam = false;
                    }
                    evalua= evaluar_beca(fam, ingre);

                    if(evalua==true){
                        Toast.makeText(getApplicationContext(), "La solicitud de "+nom+" "+ape+"  ha sido aceptada", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(), "La solicitud de "+nom+" "+ape+" ha sido rechazada", Toast.LENGTH_SHORT).show();
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
    public boolean evaluar_beca(boolean fammnumerosa,double ingresoanual){
        boolean aceptada;
        if((fammnumerosa==true && ingresoanual<20000) || (fammnumerosa==true && ingresoanual<10000)){
            aceptada=true;
        }else{
            aceptada=false;
        }
        return aceptada;

    }

}
/*
*/