package com.zyngi.gabo;
import android.widget.ImageView;
/**
 * Created by Remmy on 13/11/2017.
 */

public class Producto {


        String titulo;
        String descripcion;
        int imagen;

        public Producto(String titulo, String descripcion, int imagen) {
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.imagen = imagen;
        }


        public String getTitulo() {
            return titulo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public int getImagen() {
            return imagen;
        }



}