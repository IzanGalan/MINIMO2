package com.eetac.proyecto_dsa.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.eetac.proyecto_dsa.R;
import com.eetac.proyecto_dsa.model.UsuarioEvento;

import java.util.List;

public class UsuarioEventoAdapter extends RecyclerView.Adapter<UsuarioEventoAdapter.ViewHolder> {

    private final List<UsuarioEvento> usuarios;

    public UsuarioEventoAdapter(List<UsuarioEvento> usuarios) {
        this.usuarios = usuarios;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_usuario_evento, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UsuarioEvento u = usuarios.get(position);
        holder.tvNombre.setText(u.getName() + " " + u.getSurname());

        Glide.with(holder.itemView.getContext())
                .load(u.getAvatar())
                .circleCrop()
                .into(holder.ivAvatar);
    }

    @Override
    public int getItemCount() {
        return usuarios.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivAvatar;
        TextView tvNombre;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAvatar = itemView.findViewById(R.id.ivAvatarUsuario);
            tvNombre = itemView.findViewById(R.id.tvNombreUsuario);
        }
    }
}