package mx.edu.ittepic.reciclerviewcardview_iris;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OEM on 25/02/2018.
*/

public class AdapterDato extends RecyclerView.Adapter<AdapterDato.ObraViewHolder> {

    List<ObraMusical> obraMusicals;


    AdapterDato(List<ObraMusical> obraMusicals){
        this.obraMusicals = obraMusicals;
    }



    @Override
    public ObraViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v;
        v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.items_card, viewGroup, false);
        ObraViewHolder ovh = new ObraViewHolder(v);

        return ovh;
    }

    @Override
    public void onBindViewHolder(ObraViewHolder holder, int position) {
        holder.dato1.setText(obraMusicals.get(position).nombre);
        holder.dato2.setText(obraMusicals.get(position).descripcion);
        holder.img.setImageResource(obraMusicals.get(position).imagen);
        //holder.asignarDatos(listDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return obraMusicals.size();
    }

    public class ObraViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView dato1,dato2;
        CardView cardView;

        public ObraViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView)itemView.findViewById(R.id.cardView);
            dato1 = (TextView)itemView.findViewById(R.id.idDato1);
            dato2 = (TextView)itemView.findViewById(R.id.idDato2);
            img = (ImageView)itemView.findViewById(R.id.imagenlist);
        }

        /*public void asignarDatos(String sdata) {
            dato.setText(""+sdata);

        }*/



    }

    /*@Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }*/

}
