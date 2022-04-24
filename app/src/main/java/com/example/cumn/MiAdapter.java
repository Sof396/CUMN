package com.example.cumn;

import android.icu.text.CaseMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MiAdapter extends RecyclerView.Adapter<MiAdapter.MiViewHolder> {

    private List<datos> datos;


    public MiAdapter(List<datos> datos) {
        this.datos = datos;
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
        holder.titulo.setText(datos.get(position).getTitle());
        holder.fecha.setText(datos.get(position).getDtstart());
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public class MiViewHolder extends RecyclerView.ViewHolder {
        TextView titulo;
        TextView fecha;

        public MiViewHolder(@NonNull View itemView) {
            super(itemView);
            /// ajustar findview By ID
            titulo = itemView.findViewById(R.id.titulo);
            fecha = itemView.findViewById(R.id.fecha);
        }
    }
}

