package com.example.vistas_basicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vistas);

        //TextView
        TextView tv=(TextView)findViewById(R.id.textView1);
        tv.setText("Editamos el texto desde código");

        //Button
        Button b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.e("Info","Boton click");
            }
        });

        //CheckBox
        CheckBox cb=(CheckBox)findViewById(R.id.checkBox);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox cb=(CheckBox)v;
                if(cb.isChecked()){
                    Log.e("info","CheckBox seleccionado");
                }else{
                    Log.e("info","CheckBox no seleccionado");
                }
            }
        });

        //Radiobutton0
        RadioButton rb0=(RadioButton) findViewById(R.id.radioButton0);
        rb0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Info","RadioButton0 seleccionado");
            }
        });

        //Radiobutton1
        RadioButton rb1=(RadioButton) findViewById(R.id.radioButton1);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Info","RadioButton1 seleccionado");
            }
        });
        //EditText
        EditText et=(EditText)findViewById(R.id.editText);
        et.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if(keyCode==KeyEvent. KEYCODE_ENTER){
                    EditText et=(EditText)v;
                    Log.e("info",et.getText().toString());
                }
                return false;
            }
        });

        //Spinner
        Spinner s=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(
                this, R.array.SpinnerArray, android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?>arg0,View arg1,int arg2,long arg3) {
                Log.e("Info","Se ha seleccionado "+arg3 );
            }
            public void onNothingSelected(AdapterView<?> arg0){

            }
        });
        //Seekbar
        SeekBar sb=(SeekBar)findViewById(R.id.seekBar);
        sb.setMax(10);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Integer i=seekBar.getProgress();
                Log.e("info",i.toString());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}

 /*s.setOnItemClickListener(new AdapterView.OnItemClickListener(){
public void onItemSelected(AdapterView<?>arg0,View arg1,int arg2,long arg3){
        Log.e("Info","Se ha seleccionado "+arg3);
        }
public void onNothingSelected(AdapterView<?>arg0){

        }
        });*/