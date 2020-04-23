package com.example.calificacionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b;
    private Button b2;
    private TextView t1;
    private TextView t2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mostrar(b);
        limpiar(b2);

    }

    public void mostrar(View view){

        b=findViewById(R.id.mostrar);
        t1 =findViewById(R.id.editText2);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String toa=" ";
                Toast toast1;
                String calificacion;
                Float num;
                Boolean resultado;

                calificacion=t1.getText().toString();
                num=Float.parseFloat(calificacion);

                try {
                    Integer.parseInt(calificacion);

                    if (num >= 0 && num < 10.5) {
                        toa = "Calificación: Mala";
                    } else if (num >= 10.5 && num <= 14) {
                        toa = "Calificación: Regular";
                    } else if (num > 14 && num <= 18) {
                        toa = "Califcación: Buena";
                    } else if (num >= 19 && num <= 20) {
                        toa = "Califcación: Excelente";
                    } else {
                        toa = "No has introducido una nota correcta";
                        t1.setText("");
                    }
                    resultado = true;
                } catch (NumberFormatException excepcion) {
                    resultado = false;
                }

                if (resultado=true) {
                    toast1 = Toast.makeText(getApplicationContext(), toa, Toast.LENGTH_SHORT);
                }else {
                    toa="No has introducido un número";
                    toast1 = Toast.makeText(getApplicationContext(), toa, Toast.LENGTH_SHORT);
                }
                toast1.show();
            }
        });
    }
    public void limpiar(View view){

        b2=findViewById(R.id.limpiar);
        t2=findViewById(R.id.editText);
        t1=findViewById(R.id.editText2);

        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                t1.setText("");
                t2.setText("");
            }
        });

    }


}
