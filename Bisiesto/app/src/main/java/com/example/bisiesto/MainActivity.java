package com.example.bisiesto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    TextView t;

    String toa;
    Toast toast;
    private boolean bisi;
    private boolean es;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bisi=es_bisiesto(t);
        if (bisi==true){
            toa="Es bisiesto";
        }else {
            toa="no es visiesto";
        }
        toast= Toast.makeText(getApplicationContext(), toa, Toast.LENGTH_SHORT);
        toast.show();

    }

    public boolean es_bisiesto(View view) {
        b = findViewById(R.id.button);
        t = findViewById(R.id.editText);

        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String ano;
                Float num;
                boolean es;

                ano=t.getText().toString();
                num=Float.parseFloat(ano);
              //  Integer.parseInt(num);

                if (num%4==0&& num%100!=0 || num%400== 0){
                    es=true;
                }else {
                    es=false;
                }
            }
        });
        return es;
    }
}
