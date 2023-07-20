package com.paty.banco.app;

import com.paty.banco.modelo.atm.CaixaEletronico;
import com.paty.banco.modelo.*;
import com.paty.banco.modelo.excecao.SaldoInsuficienteException;
import com.paty.banco.modelo.pagamento.Boleto;
import com.paty.banco.modelo.pagamento.DocumentoPagavel;
import com.paty.banco.modelo.pagamento.Holerite;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Principal {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Manuela da Silva");
        titular1.setDocumento("23452323231");
        titular1.setRendimentoAnual(new BigDecimal("15000"));
        titular1.setTipo(TipoPessoa.JURIDICA);

        titular1.setDataUltimaAtualizacao(LocalDateTime.parse("2023-07-20T15:26:00"));
        System.out.println(titular1.getDataUltimaAtualizacao());

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Leonardo da Silva");
        titular2.setDocumento("87656754312");

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123 - 5, 1234);
        ContaEspecial suaConta = new ContaEspecial(titular2, 7890 - 3, 765, new BigDecimal("1000"));

        try {
            minhaConta.depositar(new BigDecimal("30000"));
            minhaConta.sacar(new BigDecimal("1000"));

            suaConta.depositar(new BigDecimal("1500"));
            suaConta.sacar(new BigDecimal("15500"));
            suaConta.debitarTarifaMensal();

            Boleto boletoEscola = new Boleto(titular2, new BigDecimal("35000"));
            Holerite salarioFuncionario = new Holerite(titular2, new BigDecimal("100"), 160);

            caixaEletronico.pagar(boletoEscola, minhaConta);
            caixaEletronico.pagar(salarioFuncionario, minhaConta);

            caixaEletronico.estornarPagamento(boletoEscola, minhaConta);

            boletoEscola.imprimirRecibo();
            salarioFuncionario.imprimirRecibo();

        } catch (SaldoInsuficienteException e) {

            System.out.println("Erro ao executar operação na conta: " + e.getMessage());
        }

        caixaEletronico.imprimirSaldo(minhaConta );
        System.out.println();
        caixaEletronico.imprimirSaldo(suaConta);

    }

}
