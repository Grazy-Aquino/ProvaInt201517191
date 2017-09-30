/**
 * Grazielly de Aquino Nascimento RA 201517191.
 */
package com.example.arqdsis.prova_campeonatobrasileiro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerTabela = (Spinner)findViewById(R.id.spinnerTabela);
        spinnerTabela.setOnItemSelectedListener(new TimeSelecionado());
    }


    public void listaTabela(View view){
        Intent intent = new Intent(this, ListaTabelaActivity.class);

        intent.putExtra(CHAVE, continente);
        startActivity(intent);
    }

private class TimeSelecionado implements AdapterView.OnItemSelectedListener {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        listaTabela(); = (String) parent.getItemAtPosition(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
}
