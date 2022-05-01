package com.example.cumn.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.cumn.R;
import com.example.cumn.models.Graph;
import com.example.cumn.models.Models;
import com.example.cumn.ui.activity.masInfo;

import java.util.ArrayList;
import java.util.List;

public class actividadesAdapter extends RecyclerView.Adapter<actividadesAdapter.ViewHolder> {

    private List<Graph> mDataSet;
    private Context context;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Creamos la nueva vista
        View tv = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.fila, parent, false);

        //Podemos definir tamaños, márgnes, paddings, etc...

        ViewHolder vh = new ViewHolder(tv);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {

        final Graph graph = mDataSet.get(i);
        holder.titulo.setText(graph.getTitle());
        holder.fecha.setText(graph.getDtstart());

        context = holder.itemView.getContext();

        holder.itemView.setOnClickListener(view -> {

            Intent masInfo = new Intent(context.getApplicationContext(), masInfo.class);
            masInfo.putExtra("titulo", graph.getTitle());
            masInfo.putExtra("descripcion", graph.getDescription());
            masInfo.putExtra("link", graph.getLink());
            masInfo.putExtra("latitud", graph.getLocation().getLatitude());
            masInfo.putExtra("longitud", graph.getLocation().getLongitude());
            masInfo.putExtra("organizacion", graph.getOrganization().getOrganizationName());

            context.startActivity(masInfo);


        });


    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private Context context;
        TextView fecha;
        TextView titulo;


        public ViewHolder(View tv){
            super(tv);
            titulo = itemView.findViewById(R.id.titulo);
            fecha = itemView.findViewById(R.id.fecha);

        }
    }

    public actividadesAdapter( ){
        mDataSet = new ArrayList<>();
    }

    public void setDataSet(List<Graph> dataSet){
        mDataSet = dataSet;
        notifyDataSetChanged();
    }

}
