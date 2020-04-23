package com.example.lanzaractividadretorno;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Actividad2 extends AppCompatActivity {

    RadioButton radio4,radio10,radio21;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elegir_iva);


        radio4=findViewById(R.id.rdb4);
        radio10=findViewById(R.id.rdb10);
        radio21=findViewById(R.id.rdb21);
        Bundle ext=getIntent().getExtras();
        final String prec=ext.getString("precio");
        final int num=Integer.parseInt(prec);

        radio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo(radio4,num);
            }
        });
        radio10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo(radio10,num);
            }
        });
        radio21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo(radio21,num);
            }
        });
    }
    public void calculo(RadioButton r,int num){

        double imp_total=0;
        if (r==radio4) {
            imp_total = (num * 0.04 )+ num;
        }
        else if(r==radio10){
            imp_total = (num * 0.10 )+ num;
        }
        else if(r==radio21){
            imp_total=(num*0.21)+num;
        }

        Intent devolver=new Intent();
        devolver.putExtra("aplicarIVA",imp_total);
        setResult(RESULT_OK,devolver);
        finish();
    }
}
