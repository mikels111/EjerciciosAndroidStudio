package com.example.conversoreurosdolares;

import androidx.appcompat.app.AppCompatActivity;

import android.media.session.MediaController;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button euroDolar,dolarEuro;
    EditText euro,dolar;
    TextView conversion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro=findViewById(R.id.editEuro);
        dolar=findViewById(R.id.editDolar);

        euroDolar=findViewById(R.id.btnEuDo);
        dolarEuro=findViewById(R.id.btnDoEu);

        conversion=findViewById(R.id.txtConversion);

        euroDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                if (euro.length() > 0 ) {
                    double conversion1 = convert_euro_dolar(euroDolar, euro);
                    conversion.setText(String.valueOf(conversion1));
                }else{
                   Toast.makeText(getApplicationContext(),"Introduce un valor en euro",Toast.LENGTH_SHORT);
                }

            }

        });
        dolarEuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dolar.length()>0) {
                    double conversion2 = convert_euro_dolar(dolarEuro, dolar);
                    conversion.setText(String.valueOf(conversion2));
                }else{
                    Toast.makeText(getApplicationContext(),"Introduce un valor en dolar",Toast.LENGTH_SHORT);
                }
            }
        });
    }

    public double convert_euro_dolar(Button btn,EditText importe){
        int num=Integer.parseInt(importe.getText().toString());
        double conv=0;
        if (btn==euroDolar){
            conv= num * 1.1;
        }
        else if(btn==dolarEuro){
            conv=num*0.90;
        }
        return conv;
    }


}
