package com.zyngi.gabo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {

    ImageView imagen;
    TextView descripcion;
    RecyclerView.ViewHolder vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        imagen=(ImageView) findViewById(R.id.imagen_detalle);
        descripcion=(TextView)findViewById(R.id.descripcion_detalle);

     setear();

    }

 public  void setear()
 {
     Bundle parametros = this.getIntent().getExtras();
     int pos = parametros.getInt("Posicion");


     switch (pos){
         case 0:
             imagen.setImageResource(R.drawable.ranga);
             descripcion.setText(R.string.ranga);
         break;

         case 1:

             imagen.setImageResource(R.drawable.charque);
             descripcion.setText(R.string.charque);
             break;

         case 2:

             imagen.setImageResource(R.drawable.chuno);
             descripcion.setText(R.string.chuño);
             break;

         case 3:

             imagen.setImageResource(R.drawable.khara);
             descripcion.setText(R.string.khara);
             break;


         case 4:

             imagen.setImageResource(R.drawable.lenteja);
             descripcion.setText(R.string.lenteja);
             break;

         case 5:

             imagen.setImageResource(R.drawable.papalisa);
             descripcion.setText(R.string.papalisa);
             break;

         case 6:

             imagen.setImageResource(R.drawable.sopamani);
             descripcion.setText(R.string.sopa_mani);
             break;

         case 7:

             imagen.setImageResource(R.drawable.thimpu);
             descripcion.setText(R.string.thimpu);
             break;

         case 8:

             imagen.setImageResource(R.drawable.fricase);
             descripcion.setText(R.string.fricase);
             break;

         case 9:

             imagen.setImageResource(R.drawable.jaconta);
             descripcion.setText(R.string.jaconta);
             break;
         case 10:

             imagen.setImageResource(R.drawable.sajta);
             descripcion.setText(R.string.sajta);
             break;


     }
 }


}
