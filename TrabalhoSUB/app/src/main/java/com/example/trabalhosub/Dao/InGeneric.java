package com.example.trabalhosub.Dao;

import com.example.trabalhosub.Model.Paises;

import java.util.ArrayList;

public interface InGeneric <Object>{
    long insert(Paises obj);
    long update(Paises obj);
    long delete(Paises obj);
    ArrayList<Paises> getAll();
    Paises getById(int id);
}

