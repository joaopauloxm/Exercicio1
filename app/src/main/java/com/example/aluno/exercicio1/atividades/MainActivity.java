package com.example.aluno.exercicio1.atividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.aluno.exercicio1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exercicio1Activity(View view) {

        startActivity(new Intent(this,Exercicio1Activity.class));

    }

    public void exercicio2Activity(View view) {

        startActivity(new Intent(this,Exercicio2Activity.class));

    }

    public void exercicio3Activity(View view) {

        startActivity(new Intent(this,Exercicio3Activity.class));

    }
}
