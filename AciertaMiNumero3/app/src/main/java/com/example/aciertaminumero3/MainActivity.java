package com.example.aciertaminumero3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText numero;
    Button boton;
    TextView resultado;
    RadioButton cerca,limite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero=findViewById(R.id.editNumero);
        boton=findViewById(R.id.btnResultado);
        resultado=findViewById(R.id.txtResultado);
        cerca=findViewById(R.id.rdbCerca);
        limite=findViewById(R.id.rdbLimite);

        final Random aleatorio=new Random();
        final int numeroAleatorio=aleatorio.nextInt(10);

        boton.setOnClickListener(new View.OnClickListener() {
            int contador=0;
            @Override
            public void onClick(View v) {


                if(numero.length()>0){

                    if(limite.isChecked()) {
                        contador++;
                        if (contador < 10) {
                            if ((Integer.parseInt(numero.getText().toString())) == numeroAleatorio) {
                                Toast.makeText(getApplicationContext(), "El número ha sido acertado", Toast.LENGTH_SHORT).show();
                                resultado.setText("Enhorabuena lo has acertado es: " + String.valueOf(numeroAleatorio));
                            }
                        }else if (contador == 10) {
                            Toast.makeText(getApplicationContext(), "Has llegado a 10 intentos", Toast.LENGTH_SHORT).show();
                            resultado.setText("El número es: " + String.valueOf(numeroAleatorio));
                        }

                    }else if(cerca.isChecked()){
                        if ((Integer.parseInt(numero.getText().toString())) > numeroAleatorio) {
                            Toast.makeText(getApplicationContext(), "El número es más pequeño", Toast.LENGTH_SHORT).show();
                        } else if ((Integer.parseInt(numero.getText().toString())) < numeroAleatorio) {

                            Toast.makeText(getApplicationContext(), "El número es más grande", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "El número ha sido acertado", Toast.LENGTH_SHORT).show();
                            resultado.setText("Enhorabuena lo has acertado es: " + String.valueOf(numeroAleatorio));
                        }

                    }else {
                        if ((Integer.parseInt(numero.getText().toString())) == numeroAleatorio) {
                            Toast.makeText(getApplicationContext(), "El número ha sido acertado", Toast.LENGTH_SHORT).show();
                            resultado.setText("Enhorabuena lo has acertado es: " + String.valueOf(numeroAleatorio));
                        }
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"Numero vacio",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
