package com.eetac.proyecto_dsa;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.eetac.proyecto_dsa.adapter.UsuarioEventoAdapter;
import com.eetac.proyecto_dsa.model.RespuestaEvento;
import com.eetac.proyecto_dsa.network.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UsuariosEventoActivity extends AppCompatActivity {

    private RecyclerView recyclerUsuarios;
    private ProgressBar progressBar;
    private TextView tvTituloEvento;
    private TextView tvContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios_evento);

        recyclerUsuarios = findViewById(R.id.recyclerUsuarios);
        progressBar      = findViewById(R.id.progressBar);
        tvTituloEvento   = findViewById(R.id.tvTituloEvento);
        tvContador = findViewById(R.id.tvContador);

        recyclerUsuarios.setLayoutManager(new LinearLayoutManager(this));

        // Nombre del evento (de momento fijo; podría venir de un Intent)
        String nombreEvento = "Torneo";

        cargarUsuarios(nombreEvento);
    }

    private void cargarUsuarios(String nombreEvento) {
        progressBar.setVisibility(View.VISIBLE);

        RetrofitClient.getService().getUsuariosEvento(nombreEvento)
                .enqueue(new Callback<RespuestaEvento>() {
                    @Override
                    public void onResponse(Call<RespuestaEvento> call, Response<RespuestaEvento> response) {
                        progressBar.setVisibility(View.GONE);
                        if (response.isSuccessful() && response.body() != null) {
                            RespuestaEvento datos = response.body();
                            tvTituloEvento.setText("Usuarios del evento: " + datos.getEvento());
                            recyclerUsuarios.setAdapter(new UsuarioEventoAdapter(datos.getUsers()));
                            tvContador.setText(datos.getUsers().size() + " usuarios registrados");
                        } else {
                            Toast.makeText(UsuariosEventoActivity.this,
                                    "Error del servidor: " + response.code(), Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<RespuestaEvento> call, Throwable t) {
                        progressBar.setVisibility(View.GONE);
                        Toast.makeText(UsuariosEventoActivity.this,
                                "Sin conexión con el servidor", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}