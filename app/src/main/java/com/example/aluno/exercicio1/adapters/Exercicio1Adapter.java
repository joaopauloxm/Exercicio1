package com.example.aluno.exercicio1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aluno.exercicio1.R;
import com.example.aluno.exercicio1.entidades.Exercicio1;

import java.util.List;


/**
 * Created by bruno on 07/04/18.
 */

public class Exercicio1Adapter extends BaseAdapter {


    Context context;
    List<Exercicio1> colecao;
    LayoutInflater inflter;

    public Exercicio1Adapter(final Context applicationContext,
                             final List<Exercicio1> colecao) {
        this.context = applicationContext;
        this.colecao = colecao;

    }

    @Override
    public int getCount() {
        return this.colecao != null ? this.colecao.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return this.colecao.get(i);
    }

    private Exercicio1 parsetItem(int i){
        return this.colecao.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // inflate the layout for each list row
        //'Infla' o layout(pega a referencia) para ser trabalhada
        //no método
        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.item_compra,
                            viewGroup, false);
        }

        // pega o objeto corrente da lista
        Exercicio1 exercicio1 = parsetItem(i);

        //Neste ponto vc ira popular os dados do seu layout,
        //utilizando JAVA.

        TextView campoPorcas, campoParafusos, campoArruelas;

        //CASO não queria declarar um campo
        //((TextView)view.findViewById(R.id.txtItemNome)).setText(pessoa.getNome());

        campoPorcas = view.findViewById(R.id.txtItemPorcas);
        campoParafusos = view.findViewById(R.id.txtItemParafusos);
        campoArruelas = view.findViewById(R.id.txtItemArruelas);

        campoPorcas.setText((int) exercicio1.getPorcas());
        campoParafusos.setText((int) exercicio1.getParafusos());
        campoArruelas.setText((int) exercicio1.getArruelas());

        return view;
    }
}
