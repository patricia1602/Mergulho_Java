package com.paty.banco.modelo.atm;

import com.paty.banco.modelo.Conta;
import com.paty.banco.modelo.pagamento.DocumentoEstornavel;
import com.paty.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {

    public void imprimirSaldo(Conta conta) {

        System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo disponível: " + conta.getSaldodisponivel());
    }

    public void pagar(DocumentoPagavel documento, Conta conta) {
        if (documento.estaPago()) {
            throw new IllegalStateException("Documento já esta pago");
        }
        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();

    }

    public void estornarPagamento(DocumentoEstornavel documento, Conta conta) {

        if (!documento.estaPago()) {
            throw new IllegalStateException("Documento não esta pago");
        }
        conta.depositar(documento.getValorTotal());
        documento.estornarPagamento();
    }
}
