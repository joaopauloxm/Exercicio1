package com.example.aluno.exercicio1.atividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.aluno.exercicio1.R;
import com.example.aluno.exercicio1.adapters.Exercicio1Adapter;
import com.example.aluno.exercicio1.entidades.Exercicio1;


public class Exercicio1Activity extends DefaultAtctivity {

    Exercicio1 exe1 = new Exercicio1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);

        minhaLista = findViewById(R.id.minhaLista);
    }


    public void adicionar(View view) {

        Double desconto = null;
        Double valorDaCompra= null;
        int qtdtotal = 0;


        //ENTRADA DE DADOS
        //Captura o componente EditText da VIEW
        txtPorcas = findViewById(R.id.txtPorcas);
        txtParafusos = findViewById(R.id.txtParafusos);
        txtArruelas = findViewById(R.id.txtArruelas);

        int qtdporcas, qtdparafusos, qtdarruelas;


        qtdporcas = Integer.parseInt(txtPorcas.getText().toString());
        qtdparafusos = Integer.parseInt(txtParafusos.getText().toString());
        qtdarruelas = Integer.parseInt(txtArruelas.getText().toString());




        if(qtdporcas > 0  && qtdparafusos > 0 && qtdarruelas > 0){

            desconto = ((qtdporcas * exe1.getPorcas())*0.10) +
                    ((qtdparafusos * exe1.getParafusos())*0.20)+
                    ((qtdarruelas * exe1.getArruelas())* 0.30);

            valorDaCompra = ((qtdporcas * exe1.getPorcas()) +
                    (qtdparafusos * exe1.getParafusos())+
                    (qtdarruelas * exe1.getArruelas()));

            qtdtotal = qtdporcas + qtdparafusos + qtdarruelas;

        }

        Exercicio1 exercicio1 = new Exercicio1(qtdporcas,
                qtdparafusos ,
                qtdarruelas, desconto,valorDaCompra,qtdtotal);


        lista.add(exercicio1);



        Exercicio1Adapter exercicio1Adapter = new Exercicio1Adapter(this, lista);
        minhaLista.setAdapter(exercicio1Adapter);
    }
}
