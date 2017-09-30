package com.example.arqdsis.prova_campeonatobrasileiro;

/**
 * Grazielly de Aquino Nascimento RA 201517191.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.sql.Time;

public class DetalheTabelaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_tabela);
        TextView txtTime = (TextView)findViewById(R.id.txtTime);
        Intent intent = getIntent();
        Time time = (Time)intent.getSerializableExtra(ListaTabelaActivity.TIMES);
        txtTime.setText(time.toString());
    }
}
