package com.zyngi.gabo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Remmy on 13/11/2017.
 */

public class viewHolder extends RecyclerView.ViewHolder {

        private Context context;
        TextView titulo;
        ImageView imagen;
        Button boton1;
        Button boton2;
    View cardView;



    public viewHolder(View itemView)
        {
            super(itemView);

            context = itemView.getContext();
            cardView = itemView.findViewById(R.id.card_main);
            boton1= (Button) itemView.findViewById(R.id.button);
            boton2= (Button) itemView.findViewById(R.id.button2);
            imagen= (ImageView) itemView.findViewById(R.id.imagen_item);
            titulo=(TextView) itemView.findViewById(R.id.texto_item);

            boton1.setOnClickListener( new View.OnClickListener(){
                @Override
                public void onClick(View v) {

                    final Intent intent;
                    int poss=viewHolder.super.getAdapterPosition();
                    switch (poss){
                        case 0:
                            intent =  new Intent(context, Detalle.class);
                            break;

                        case 1:
                            intent =  new Intent(context, Detalle.class);
                            break;

                        case 2:
                            intent =  new Intent(context, Detalle.class);
                            break;

                        case 3:
                            intent =  new Intent(context, Detalle.class);
                            break;

                        case 4:
                            intent =  new Intent(context, Detalle.class);
                            break;

                        case 5:
                            intent =  new Intent(context, Detalle.class);
                            break;

                        case 6:
                            intent =  new Intent(context, Detalle.class);
                            break;
                        case 7:
                            intent =  new Intent(context, Detalle.class);
                            break;
                        case 8:
                            intent =  new Intent(context, Detalle.class);
                            break;
                        case 9:
                            intent =  new Intent(context, Detalle.class);
                            break;

                        default:
                            intent =  new Intent(context, Detalle.class);
                            break;
                    }
                    intent.putExtra("Posicion",poss);
                    context.startActivity(intent);

                }



            });

        }

        public  int conseguirPosicion()
        {
            return viewHolder.super.getAdapterPosition();
        }
}

