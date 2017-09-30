package com.example.arqdsis.prova_campeonatobrasileiro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Grazielly de Aquino Nascimento RA 201517191.
 */

public class ListaTabelaActivity {
}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_tabela);
        atividade = this;
        Intent intent = getIntent();
        String dados = intent.getStringExtra(MainActivity.CHAVE);
        time = Data.listaTime(dados);


        ListView listView = (ListView) findViewById(R.id.lista_times);
        TabelaAdapter adapter = new TabelaAdapter(times, this);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // manda para a tela de detalhe
                Intent intent = new Intent(atividade, DetalheTabelaActivity.class);
                intent.putExtra(Tabela, tabela[position]);

                startActivity(intent);

            }

        });
    }
}

