package com.zyngi.gabo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class AltiplanoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altiplano);


        ArrayList<Producto> lista=new ArrayList<Producto>();
        lista.add(new Producto("Ranga","", R.drawable.ranga));
        lista.add(new Producto("Charquecan","", R.drawable.charque));
        lista.add(new Producto("Lagua de Chuño","", R.drawable.chuno));
        lista.add(new Producto("KHARA PURKA","", R.drawable.khara));
        lista.add(new Producto("AJI DE LENTEJA","", R.drawable.lenteja));
        lista.add(new Producto("AJI DE PAPALISA","", R.drawable.papalisa));
        lista.add(new Producto("SOPA DE MANI","", R.drawable.sopamani));
        lista.add(new Producto("THIMPU","", R.drawable.thimpu));
        lista.add(new Producto("FRICASE","", R.drawable.fricase));
        lista.add(new Producto("JACONTHA","", R.drawable.jaconta));
        lista.add(new Producto("SAJTA","", R.drawable.sajta));


        RecyclerView contenedor = (RecyclerView) findViewById(R.id.recycler_view_mdAltiplano);

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
