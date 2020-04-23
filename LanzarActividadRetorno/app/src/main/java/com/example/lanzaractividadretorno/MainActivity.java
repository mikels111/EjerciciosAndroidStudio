package com.example.lanzaractividadretorno;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit_nom,edit_imp;
    Button botonIVA;
    TextView imp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //edit_nom=findViewById(R.id.txtNombre);
        edit_imp=findViewById(R.id.txtImporte);
        botonIVA=findViewById(R.id.btnIVA);
        imp=findViewById(R.id.viewImporte);

        botonIVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
            }
        });
    }
    public void calcular(){
        final Intent intent=new Intent(MainActivity.this,Actividad2.class);
        intent.putExtra("precio", edit_imp.getText().toString());
        startActivityForResult(intent,1234);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1234){
            if (resultCode==RESULT_OK){
                int vuelta=data.getIntExtra("aplicarIVA",0);
                imp.setText(String.valueOf(vuelta));
            }
        }
    }

}
