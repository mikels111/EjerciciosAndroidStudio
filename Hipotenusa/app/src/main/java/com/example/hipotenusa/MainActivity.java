package com.example.hipotenusa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private double hip;
    Button botonCalcular,botonLimpiar;
    EditText catetoC,catetoB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonLimpiar=findViewById(R.id.btnLimpiar);
        botonCalcular=findViewById(R.id.btnCalcular);

        catetoC=findViewById(R.id.editC);
        catetoB=findViewById(R.id.editB);

        String cTexto,bTexto;
        double cNum,bNum,hip;

        cTexto=catetoC.getText().toString();
        cNum=Double.parseDouble(cTexto);

        bTexto=catetoB.getText().toString();
        bNum=Double.parseDouble(bTexto);

        hip=calcular_hipotenusa(cNum,bNum);
        Log.e("info", String.valueOf(hip));
        limpiar_controles(catetoC,catetoB);

    }



    public double calcular_hipotenusa(final double c, final double b){

        botonCalcular.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                hip=Math.sqrt(c*2+b*2);

            }
        });

        return hip;
    }
    public void limpiar_controles(final EditText b, final EditText c ){

        botonLimpiar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                b.setText(" ");
                c.setText(" ");
            }
        });
    }


}
