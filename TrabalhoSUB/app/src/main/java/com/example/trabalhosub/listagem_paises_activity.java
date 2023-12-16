package com.example.trabalhosub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.trabalhosub.Adapter.adapter_Pais;
import com.example.trabalhosub.Controller.ControllerPais;
import com.example.trabalhosub.Model.Paises;

import java.util.ArrayList;

public class listagem_paises_activity extends AppCompatActivity {
    private ControllerPais controller;
    private RecyclerView rvPais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_paises);
        rvPais = findViewById(R.id.rvPais);
        carregarListadePaisesCadastrados();
    }
    private void carregarListadePaisesCadastrados(){
        ArrayList<Paises> listaPais = controller.retornar(this);
        adapter_Pais adapter = new adapter_Pais(this, listaPais);

        rvPais.setLayoutManager(new LinearLayoutManager(this));
        rvPais.setAdapter(adapter);
    }
}