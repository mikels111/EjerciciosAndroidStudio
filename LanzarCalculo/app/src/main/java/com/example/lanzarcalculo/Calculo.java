package com.example.lanzarcalculo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Calculo extends AppCompatActivity {

    private EditText edit1,edit2;
    private int mult,edit1num;
    private Button boton;

    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edit1=findViewById(R.id.txtNumero);
        edit2=findViewById(R.id.txtResultado);
        boton=findViewById(R.id.btnMultiplicar);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo();
            }
        });

    }
    private void calculo(){
        mult=Integer.parseInt(edit1.getText().toString())*2;
        edit2.setText(String.valueOf(mult));
        Intent devuelve= new Intent();
        devuelve.putExtra("multiplicar",edit2.getText());
        setResult(RESULT_OK,devuelve);
        finish();
       // Toast.makeText(getApplicationContext(),mult, Toast.LENGTH_SHORT ).show();
    }


}
