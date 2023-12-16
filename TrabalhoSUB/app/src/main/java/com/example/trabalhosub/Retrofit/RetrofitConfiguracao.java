package com.example.trabalhosub.Retrofit;

import com.example.trabalhosub.Service.IPais;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfiguracao {
    private Retrofit retrofit;
    private static final String BASE_URL = "https://falabr.cgu.gov.br/";

    public RetrofitConfiguracao() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public IPais paisService() {
        return this.retrofit.create(IPais.class);
    }
}
