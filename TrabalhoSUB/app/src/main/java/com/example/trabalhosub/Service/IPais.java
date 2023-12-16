package com.example.trabalhosub.Service;

import java.util.ArrayList;
import java.util.ArrayList;

import com.example.trabalhosub.Dto.DtoPaises;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IPais {
        @GET("api/paises")
        Call<ArrayList<DtoPaises>> getPaisDtoCall();

}
