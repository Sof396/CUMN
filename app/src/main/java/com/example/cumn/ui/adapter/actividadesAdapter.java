package com.example.cumn.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cumn.R;
import com.example.cumn.models.Graph;

import java.util.ArrayList;
import java.util.List;

public class actividadesAdapter extends RecyclerView.Adapter<actividadesAdapter.ViewHolder> {

    private List<Graph> mDataSet;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Creamos la nueva vista
        TextView tv = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.actividad_view, parent, false);

        //Podemos definir tamaños, márgnes, paddings, etc...

        ViewHolder vh = new ViewHolder(tv);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {

        holder.textView.setText(mDataSet.get(i).getTitle());

    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public ViewHolder(TextView tv){
            super(tv);
            textView = tv;
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
