package com.eetac.proyecto_dsa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.eetac.proyecto_dsa.model.User;
import com.eetac.proyecto_dsa.network.RetrofitClient;
import com.eetac.proyecto_dsa.utils.LocalUserManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private Button btnLogin;
    private TextView tvGoToRegister;
    private LocalUserManager userManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userManager = new LocalUserManager(this);

        if (userManager.isLoggedIn()) {
            goToMain();
            return;
        }

        etUsername     = findViewById(R.id.etUsername);
        etPassword     = findViewById(R.id.etPassword);
        btnLogin       = findViewById(R.id.btnLogin);
        tvGoToRegister = findViewById(R.id.tvGoToRegister);

        btnLogin.setOnClickListener(v -> {
            // ===== MODO PRUEBA EJ5: entrar sin servidor =====
            // TODO: quitar esto y restaurar el login real cuando la BBDD funcione
            userManager.saveSession("Izan");
            goToMain();
        });

        tvGoToRegister.setOnClickListener(v ->
                startActivity(new Intent(this, RegisterActivity.class))
        );
    }

    private void goToMain() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}