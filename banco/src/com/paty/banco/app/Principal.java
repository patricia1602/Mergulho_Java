package com.paty.banco.app;

import com.paty.banco.modelo.Conta;
import com.paty.banco.modelo.Pessoa;

public class Principal {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Manuela");
        titular1.setDocumento("23452323231");

       Pessoa titular2 = new Pessoa();
       titular2.setNome("Leonardo");
       titular2.setDocumento("87656754312");

        Conta minhaConta =  new Conta(titular1, 123-5,1234);
        Conta suaConta = new Conta(titular2, 7890-3, 765);

        minhaConta.depositar(15_000);
        minhaConta.sacar(1_000, 10);

        suaConta.depositar(15_000);

        System.out.println("Titular : " + minhaConta.getTitular().getNome());
        System.out.println("Saldo : " + minhaConta.getSaldo());

        System.out.println("Titular : " + suaConta.getTitular().getNome());
        System.out.println("Saldo : " + suaConta.getSaldo());

    }
}
