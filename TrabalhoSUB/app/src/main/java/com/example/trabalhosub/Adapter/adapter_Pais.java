package com.example.trabalhosub.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.trabalhosub.Model.Paises;
import com.example.trabalhosub.R;

import java.util.ArrayList;

public class adapter_Pais extends RecyclerView.Adapter<adapter_Pais.ViewHolder> {

    private ArrayList<Paises> listaPaises;
    private LayoutInflater inflater;

    public adapter_Pais(Context context, ArrayList<Paises> listaPaises) {
        this.inflater = LayoutInflater.from(context);
        this.listaPaises = listaPaises;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.paises_listagem, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Paises pais = listaPaises.get(position);

        holder.tvCodigo.setText(String.valueOf(pais.getCodigo()));
        holder.tvDescricao.setText(pais.getDescricao());
    }
    @Override
    public int getItemCount() {
        return listaPaises.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCodigo, tvDescricao;
        public ViewHolder(View itemView) {
            super(itemView);
            tvCodigo = itemView.findViewById(R.id.tvCodigo);
            tvDescricao = itemView.findViewById(R.id.tvDescricao);
        }
    }
}
