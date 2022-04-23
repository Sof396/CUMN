/*package com.example.cumn;

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


    public MiAdapter(List<Persona> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public MiAdapter.MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //// para devolver el xml de la fila
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);
        MiViewHolder vh = new MiViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MiAdapter.MiViewHolder holder, int position) {
        //// rellenar los datos del layout
        holder.nombre.setText(datos.get(position).getNombre());
        holder.dni.setText(""+datos.get(position).getDni());

        /// cargar la imagen
        Picasso.get().load("https://www.etsisi.upm.es/sites/all/themes/zircon/images/UPM.png").into(holder.foto);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public class MiViewHolder extends RecyclerView.ViewHolder {
        TextView nombre;
        TextView dni;
        ImageView foto;

        public MiViewHolder(@NonNull View itemView) {
            super(itemView);
            /// ajustar findview By ID
            nombre = itemView.findViewById(R.id.txt_nombre);
            dni = itemView.findViewById(R.id.txt_dni);
            foto = itemView.findViewById(R.id.img_foto);
        }
    }
}

 */