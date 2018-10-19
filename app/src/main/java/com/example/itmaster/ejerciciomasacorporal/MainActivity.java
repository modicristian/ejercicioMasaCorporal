package com.example.itmaster.ejerciciomasacorporal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Toolbar toolbar;
    private TextView txtViewPeso, txtViewAltura, txtViewGenero, txtViewEdad;
    private EditText editTextPeso, editTextAltura, editTextEdad;
    private Spinner spinnerGenero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtViewPeso = findViewById(R.id.txtViewPeso);
        txtViewAltura = findViewById(R.id.txtViewAltura);
        txtViewGenero = findViewById(R.id.txtViewGenero);
        txtViewEdad = findViewById(R.id.txtViewEdad);

        editTextPeso = findViewById(R.id.editTextPeso);
        editTextAltura = findViewById(R.id.editTextAltura);
        editTextEdad = findViewById(R.id.editTextEdad);

        spinnerGenero = findViewById(R.id.spinnerGenero);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        getSupportActionBar().setTitle("CALCULAR LA MASA CORPORAL");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }
        switch (item.getItemId()){
            case R.id.salir:
                break;
        }
        switch (item.getItemId()){
            case R.id.guardar:
                break;
        }
        return true;
    }

}
