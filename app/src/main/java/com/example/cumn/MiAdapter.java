package com.example.cumn;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cumn.models.Graph;
import com.example.cumn.models.Models;
import com.google.gson.Gson;

import java.lang.ref.WeakReference;
import java.util.List;

public class MiAdapter extends RecyclerView.Adapter<MiAdapter.MiViewHolder> {

    private List<Graph> graphs;

    private Context context;


    public MiAdapter(List<Graph> graphs) {
        this.graphs = graphs;

    }

    @NonNull
    @Override
    public MiAdapter.MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //// para devolver el xml de la fila
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fila, parent, false);
        MiViewHolder vh = new MiViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MiAdapter.MiViewHolder holder, int position) {
        //// rellenar los datos del layout
        holder.titulo.setText(graphs.get(position).getTitle());
        holder.fecha.setText(graphs.get(position).getDtstart());

    }

    @Override
    public int getItemCount() {
        return graphs.size();
    }

    public class MiViewHolder extends RecyclerView.ViewHolder  {
        TextView titulo;
        TextView fecha;
        Graph graph;
        int position;
        WeakReference<ClickListener> listenerRef;

        public MiViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            /// ajustar findview By ID
            titulo = itemView.findViewById(R.id.titulo);
            fecha = itemView.findViewById(R.id.fecha);

            itemView.setOnClickListener((view -> {
                Intent masInfo = new Intent(context, com.example.cumn.masInfo.class);
                Gson gson = new Gson();
                masInfo.putExtra("datos", gson.toJson((graph)));
            }));


        }

    }
}

