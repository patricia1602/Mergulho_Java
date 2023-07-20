package com.paty.banco.app;

import com.paty.banco.modelo.atm.CaixaEletronico;
import com.paty.banco.modelo.*;
import com.paty.banco.modelo.pagamento.Boleto;
import com.paty.banco.modelo.pagamento.DocumentoPagavel;
import com.paty.banco.modelo.pagamento.Holerite;

public class Principal {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Manuela da Silva");
        titular1.setDocumento("23452323231");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Leonardo da Silva");
        titular2.setDocumento("87656754312");

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123 - 5, 1234);
        ContaEspecial suaConta = new ContaEspecial(titular2, 7890 - 3, 765, 1_000);

        minhaConta.depositar(30_000);
        minhaConta.sacar(1_000);
      //minhaConta.creditarRendimentos(0.8);
      //minhaConta.debitarTarifaMensal();

        suaConta.depositar(15_000);
        suaConta.sacar(15_500);
        suaConta.debitarTarifaMensal();

        Boleto boletoEscola = new Boleto(titular2, 800 );
        Holerite salarioFuncionario = new Holerite(titular2, 100, 160);

        caixaEletronico.pagar(boletoEscola, minhaConta);
        caixaEletronico.pagar(salarioFuncionario, minhaConta);

        caixaEletronico.estornarPagamento(boletoEscola, minhaConta);

        boletoEscola.imprimirRecibo();
        salarioFuncionario.imprimirRecibo();

      //System.out.println("Boleto pago: " + boletoEscola.estaPago());
      //System.out.println("Salario pago: " + salarioFuncionario.estaPago());

        caixaEletronico.imprimirSaldo(minhaConta );
        System.out.println();
        caixaEletronico.imprimirSaldo(suaConta);
    }

}
