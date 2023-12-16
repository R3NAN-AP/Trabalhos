package com.example.trabalhosub.Controller;

import android.content.Context;

import com.example.trabalhosub.Dao.DaoDoPais;
import com.example.trabalhosub.Dto.DtoPaises;
import com.example.trabalhosub.Model.Paises;
import com.example.trabalhosub.Retrofit.RetrofitConfiguracao;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ControllerPais {
    private static Context context;
    public static void getViaPais(Context context){
        try{
            retrofit2.Call<ArrayList<DtoPaises>> call = new RetrofitConfiguracao().paisService().getPaisDtoCall();
            call.enqueue(new Callback<ArrayList<DtoPaises>>() {
                @Override
                public void onResponse(Call<ArrayList<DtoPaises>> call, Response<ArrayList<DtoPaises>> response) {
                    ArrayList<DtoPaises> listaPais = response.body();
                    for (int i = 0 ; i <listaPais.size(); i++){
                        DtoPaises pais = listaPais.get(i);
                        salvar(pais.getCodigo(), pais.getDescricao(),context);
                    }}
                @Override
                public void onFailure(Call<ArrayList<DtoPaises>> call, Throwable t) {
                }
            });
        }catch (Exception ex){}
    }
    public static String salvar(int codigo, String descricao, Context context){
        try {
            Paises pais = new Paises();

            pais.setCodigo(codigo);
            pais.setDescricao(descricao);

            DaoDoPais.getInstancia(context).insert(pais);
        } catch (Exception ex) {
            return "Erro ao gravar pais." + ex.getMessage();
        }
        return null;
    }
    public static ArrayList<Paises> retornar(Context context){
        return DaoDoPais.getInstancia(context).getAll();
    }
}
