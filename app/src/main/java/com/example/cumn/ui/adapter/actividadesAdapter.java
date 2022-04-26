package com.example.cumn.ui.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cumn.R;
import com.example.cumn.models.Graph;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class actividadesAdapter extends RecyclerView.Adapter<actividadesAdapter.ViewHolder> {

    private List<Graph> mDataSet;

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

        holder.titulo.setText(mDataSet.get(i).getTitle());
        holder.fecha.setText(mDataSet.get(i).getDtstart());

    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        //public TextView textView;
        TextView fecha;
        TextView titulo;
        public ViewHolder(View tv){
            super(tv);
            //textView = tv;
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
