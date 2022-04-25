package com.example.cumn;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.ref.WeakReference;
import java.util.List;

public class MiAdapter extends RecyclerView.Adapter<MiAdapter.MiViewHolder> {

    private List<dato> datos;
    private final ClickListener listener;


    public MiAdapter(List<dato> datos, ClickListener listener) {
        this.datos = datos;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MiAdapter.MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //// para devolver el xml de la fila
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fila, parent, false);
        MiViewHolder vh = new MiViewHolder(v,listener);
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

    public class MiViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        TextView titulo;
        TextView fecha;
        WeakReference<ClickListener> listenerRef;

        public MiViewHolder(@NonNull View itemView, ClickListener listener) {
            super(itemView);
            /// ajustar findview By ID

            listenerRef = new WeakReference<>(listener);

            titulo = itemView.findViewById(R.id.titulo);
            fecha = itemView.findViewById(R.id.fecha);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {

            if (view.getId() == titulo.getId()) {
                Toast.makeText(view.getContext(), "ITEM PRESSED = " + String.valueOf(getAbsoluteAdapterPosition()), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(view.getContext(), "ROW PRESSED = " + String.valueOf(getAbsoluteAdapterPosition()), Toast.LENGTH_SHORT).show();
            }

            listenerRef.get().onPositionClicked(getAbsoluteAdapterPosition());

        }

        @Override
        public boolean onLongClick(View view) {
            final AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
            builder.setTitle("Hello Dialog")
                    .setMessage("LONG CLICK DIALOG WINDOW FOR ICON " + String.valueOf(getAbsoluteAdapterPosition()))
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

            builder.create().show();
            listenerRef.get().onLongClicked(getAbsoluteAdapterPosition());
            return true;
        }
    }

}

