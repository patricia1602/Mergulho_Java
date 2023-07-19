package com.paty.banco.app;

import com.paty.banco.modelo.Conta;
import com.paty.banco.modelo.ContaEspecial;
import com.paty.banco.modelo.ContaInvestimento;
import com.paty.banco.modelo.Pessoa;

public class Principal {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Manuela");
        titular1.setDocumento("23452323231");

       Pessoa titular2 = new Pessoa();
       titular2.setNome("Leonardo");
       titular2.setDocumento("87656754312");

        ContaInvestimento minhaConta =  new ContaInvestimento(titular1, 123-5,1234);
        ContaEspecial suaConta = new ContaEspecial(titular2, 7890-3, 765, 1_000);

        //minhaConta.depositar(15_000);
        //minhaConta.sacar(1_000);
        //minhaConta.creditarRendimentos(0.8);

        suaConta.depositar(15_000);
        suaConta.sacar(15_500);

        //System.out.println("Titular : " + minhaConta.getTitular().getNome());
        //System.out.println("Saldo : " + minhaConta.getSaldo());

        System.out.println("Titular : " + suaConta.getTitular().getNome());
        System.out.println("Saldo : " + suaConta.getSaldo());

    }
}
