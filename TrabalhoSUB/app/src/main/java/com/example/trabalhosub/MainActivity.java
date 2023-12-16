package com.example.trabalhosub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.trabalhosub.Controller.ControllerPais;

public class MainActivity extends AppCompatActivity {
    private Button btBuscarDados;

    private Button btExibirPaises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btExibirPaises = findViewById(R.id.btExibirPaises);
        btBuscarDados = findViewById(R.id.btBuscarDados);
        btBuscarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ControllerPais.getViaPais(MainActivity.this);
            }
        });

        btExibirPaises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, listagem_paises_activity.class);
                startActivity(intent);
            }
        });
    }
}