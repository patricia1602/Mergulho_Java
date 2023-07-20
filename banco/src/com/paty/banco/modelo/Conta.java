package com.paty.banco.modelo;

import com.paty.banco.modelo.excecao.SaldoInsuficienteException;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private BigDecimal saldo = BigDecimal.ZERO;

    Conta() {

    }
        public Conta(Pessoa titular, int agencia, int numero) {
        Objects.requireNonNull(titular);

        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        
    }
    public void depositar (BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw  new IllegalStateException("Valor deve ser maior que 0");
        }
        saldo = saldo.add(valor);
    }

    public void sacar (BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw  new IllegalStateException("Valor deve ser maior que 0");
        }
        if (getSaldodisponivel().subtract(valor).compareTo(BigDecimal.ZERO) < 0) {
            throw  new SaldoInsuficienteException("SaLdo insuficiente");
        }
            saldo = saldo.subtract(valor);
    }

    public void sacar(BigDecimal valor, BigDecimal taxaSaque) {
        sacar(valor.add(taxaSaque));
    }

    public abstract void debitarTarifaMensal();

    public Pessoa getTitular() {

        return titular;
    }

    public int getAgencia() {

        return agencia;
    }

    public int getNumero() {

        return numero;
    }

    public BigDecimal getSaldo() {

        return saldo;
    }

    public BigDecimal getSaldodisponivel() {
        return getSaldo();
    }
}
