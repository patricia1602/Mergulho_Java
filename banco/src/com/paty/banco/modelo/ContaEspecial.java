package com.paty.banco.modelo;

public class ContaEspecial extends Conta {

    private double valorLimite;
    public ContaEspecial(Pessoa titular, int agencia, int numero, double valorLimite) {
        super(titular, agencia, numero);
        this.valorLimite = valorLimite;

    }

    @Override
    public double getSaldodisponivel() {
        return getSaldo() + getValorLimite();
    }

    public double getValorLimite() {

        return valorLimite;
    }

    public void setValorLimite(double valorLimite) {

        this.valorLimite = valorLimite;
    }
}