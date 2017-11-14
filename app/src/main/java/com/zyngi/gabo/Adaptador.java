package com.zyngi.gabo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Remmy on 13/11/2017.
 */

public class Adaptador extends RecyclerView.Adapter<viewHolder> {

        private List<Producto> listaObjetos;

        public Adaptador(List<Producto> listaObjetos) {
            this.listaObjetos = listaObjetos;
        }



        // El layout manager invoca este método
        // para renderizar cada elemento del RecyclerView*/
        @Override
        public viewHolder onCreateViewHolder(ViewGroup parent,
                                             int viewType) {
            // Creamos una nueva vista
            View vista = (View) LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_card, parent, false);

            // Aquí podemos definir tamaños, márgenes, paddings
            // ...


            return new viewHolder(vista) {
            };
        }

        // Este método reemplaza el contenido de cada view,
        // para cada elemento de la lista (nótese el argumento position)
        @Override
        public void onBindViewHolder(viewHolder holder, int position) {

            // - obtenemos un elemento del dataset según su posición
            // - reemplazamos el contenido de los views según tales datos


            holder.titulo.setText(listaObjetos.get(position).getTitulo());
            holder.imagen.setImageResource(listaObjetos.get(position).getImagen());

        }

        // Método que define la cantidad de elementos del RecyclerView
        // Puede ser más complejo en RecyclerViews que implementar filtros o búsquedas
        @Override
        public int getItemCount() {
            return listaObjetos.size();
        }



}
