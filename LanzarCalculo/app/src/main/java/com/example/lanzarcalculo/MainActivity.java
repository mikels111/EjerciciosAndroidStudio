package com.example.lanzarcalculo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button calcular,salir;
    EditText nombre;
    ConstraintLayout constraintLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular=findViewById(R.id.btnCalcular);
        salir=findViewById(R.id.btnSalir);
        nombre=findViewById(R.id.txtNombre);

        calcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calcular();
            }
        });
        salir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void calcular(){
        final Intent intent=new Intent(MainActivity.this,Calculo.class);
        startActivityForResult(intent,1234);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1234){
            if (resultCode==RESULT_OK){
                String vuelta=data.getStringExtra("multiplicar");
            }
        }
    }
}
