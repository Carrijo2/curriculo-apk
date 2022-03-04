package com.example.apresentation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apresentation.R;
import com.example.apresentation.model.Experience;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Experience> listaFinal;

    public Adapter(List<Experience> listaExperiencia) {
        this.listaFinal = listaExperiencia;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View intemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);


        return new MyViewHolder(intemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Experience experience = listaFinal.get( position );
        holder.cargo.setText( experience.getCargo());
        holder.tempo.setText( experience.getTempo());
        holder.empresa.setText( experience.getEmpresa());
        holder.atividadesDesenvolvidas.setText(experience.getDescription());
    }

    @Override
    public int getItemCount() {
        return listaFinal.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView empresa;
        TextView tempo;
        TextView cargo;
        TextView atividadesDesenvolvidas;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            empresa                 = itemView.findViewById(R.id.textEmpresa);
            tempo                   = itemView.findViewById(R.id.textTempo);
            cargo                   = itemView.findViewById(R.id.textCargo);
            atividadesDesenvolvidas = itemView.findViewById(R.id.textDescripiton);

        }
    }

}
