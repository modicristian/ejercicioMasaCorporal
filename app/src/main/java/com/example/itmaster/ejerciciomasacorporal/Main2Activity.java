package com.example.itmaster.ejerciciomasacorporal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView txtViewResultado, txtViewEstado, txtViewIdeal, txtViewRiesgo;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtViewResultado = findViewById(R.id.txtViewResultado);
        txtViewEstado = findViewById(R.id.txtViewEstado);
        txtViewIdeal = findViewById(R.id.txtViewIdeal);
        txtViewRiesgo = findViewById(R.id.txtViewRiesgo);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        getSupportActionBar().setTitle("CALCULAR LA MASA CORPORAL");

    }
}
