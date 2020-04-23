package com.example.comunicacionactividades;

import android.content.Intent;
import android.os.Bundle;

class NuevaClase {
    protected void onCreate(Bundle savedInstanceState){

    }

    Bundle extras = getIntent().getExtras();

    private Intent getIntent() {
        return null;
    }

    String s = extras.getString("usuario");
    int i = extras.getInt("edad");
}
