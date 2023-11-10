package com.example.weathercan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsuario;
    private EditText editTextSenha;
    private Button buttonEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextSenha = findViewById(R.id.editTextSenha);
        buttonEntrar = findViewById(R.id.buttonEntrar);

        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = editTextUsuario.getText().toString();
                String senha = editTextSenha.getText().toString();

                if (usuario.equals("irrigação") && senha.equals("123")) {
                    // Credenciais corretas, permitir o acesso à HomeActivity
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                } else {
                    // Credenciais incorretas, exiba uma mensagem de erro
                    Toast.makeText(MainActivity.this, "Credenciais inválidas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}