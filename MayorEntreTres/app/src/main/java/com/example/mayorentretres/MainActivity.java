package com.example.mayorentretres;
/*Desarrollar una aplicación que determine el mayor de 3 número ingresados.
Crear un método de nombre mayor_tres que dados tres números devuelva el mayor.*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button boton;
    TextView num1,num2,num3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int mayor_tres(View view){

        boton=findViewById(R.id.button);
        num1=findViewById(R.id.editText1);
        num2=findViewById(R.id.editText2);
        num3=findViewById(R.id.editText3);

        boton.setOnClickListener(new View.OnClickListener() {
            int max;
            public void onClick(View v) {

                if()
            }
        });
    }
}
