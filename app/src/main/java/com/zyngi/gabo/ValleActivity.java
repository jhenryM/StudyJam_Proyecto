package com.zyngi.gabo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ValleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valle);


        ArrayList<Producto> lista=new ArrayList<Producto>();
        lista.add(new Producto("INTENDENTE","", R.drawable.intendente));
        lista.add(new Producto("CHARQUECAN","", R.drawable.charque));
        lista.add(new Producto("LAGUA DE CHOCLO","", R.drawable.choclo));
        lista.add(new Producto("JOLKE","", R.drawable.jolke));
        lista.add(new Producto("KOKO DE POLLO","", R.drawable.koko));
        lista.add(new Producto("LAPHIN","", R.drawable.laphin));
        lista.add(new Producto("MECHADO DE CORDERO","", R.drawable.mechado));
        lista.add(new Producto("LOMO MONTADO","", R.drawable.montado));
        lista.add(new Producto("PIQUE MACHO","", R.drawable.pique));
        lista.add(new Producto("CALDO DE CARDAN","", R.drawable.cardan));
        lista.add(new Producto("CHICHARON","", R.drawable.chicharon));
        lista.add(new Producto("RANGA RANGA","", R.drawable.ranga));


        RecyclerView contenedor = (RecyclerView) findViewById(R.id.recycler_view_mdValle);

        // Usar esta línea para mejorar el rendimiento
        // si sabemos que el contenido no va a afectar
        // el tamaño del RecyclerView
        contenedor.setHasFixedSize(true);

        // Nuestro RecyclerView usará un linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        // Asociamos un adapter (ver más adelante cómo definirlo)
        contenedor.setAdapter(new Adaptador(lista));
        contenedor.setLayoutManager(layoutManager);
    }
}
