package com.example.aluno.exercicio1.entidades;

public class Exercicio1 {
    public int porcas = 10;
    public int parafusos = 20;
    public int arruelas = 30;


    public Exercicio1(int qtdporcas, int qtdparafusos, int qtdarruelas, Double desconto, Double valorDaCompra, int qtdtotal){

    }


    public Exercicio1() {
        this.porcas = porcas;
        this.parafusos = parafusos;
        this.arruelas = arruelas;
    }



    public double getPorcas() {
        return porcas;
    }

    public void setPorcas(int porcas) {
        this.porcas = porcas;
    }

    public double getParafusos() {
        return parafusos;
    }

    public void setParafusos(int parafusos) {
        this.parafusos = parafusos;
    }

    public double getArruelas() {
        return arruelas;
    }

    public void setArruelas(int arruelas) {
        this.arruelas = arruelas;
    }

    @Override
    public String toString() {
        return "Exercicio1{" + "porcas=" + porcas + ", parafusos=" + parafusos + ", arruelas=" + arruelas + '}';
    }


}
