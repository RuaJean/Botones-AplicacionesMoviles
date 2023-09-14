package com.edu.botones.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.botones.R;
import com.edu.botones.model.Pokemon;

import java.util.List;

public class AdapterPokemon extends RecyclerView.Adapter<AdapterPokemon.vh> {

    List<Pokemon> pokemonlist;

    public AdapterPokemon(List<Pokemon> pokemonList){this.pokemonlist = pokemonList; }
    
    @NonNull
    @Override
    public AdapterPokemon.vh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_pokemons,null,false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPokemon.vh holder, int position) {
        holder.txtName.setText(pokemonlist.get(position).getName());
        holder.txtUrl.setText(pokemonlist.get(position).getUrl());
    }

    @Override
    public int getItemCount() {
        return pokemonlist.size();
    }

    public class vh extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView txtUrl;
        public vh(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.tvName);
            txtUrl = itemView.findViewById(R.id.tvUrl);
        }
    }


}
