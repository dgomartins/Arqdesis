package com.example.diego.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DisplayMessageActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String origem = intent.getStringExtra("origem");
        String destino = intent.getStringExtra("destino");

        VooRepository rep = new VooRepository();
        ArrayList<Voo> voos = (ArrayList<Voo>) rep.getVoosDisponiveis(origem, destino);

        ArrayList<String> items = new ArrayList<String>();
        for(Voo voo : voos) {
           items.add("Codigo do Voo: "+voo.getCodigo()+" Data da Partida: "+voo.getDataPartida());
        }

        ArrayAdapter<String> mAdaptador = new ArrayAdapter(this,android.R.layout.simple_list_item_1, items);
        setListAdapter(mAdaptador);








    }




}
