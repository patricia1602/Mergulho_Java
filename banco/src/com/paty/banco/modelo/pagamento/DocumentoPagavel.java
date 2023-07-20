package com.paty.banco.modelo.pagamento;

import java.math.BigDecimal;

public interface DocumentoPagavel {

    BigDecimal getValorTotal();

    boolean estaPago();

    void quitarPagamento();

    default void imprimirRecibo() {
        System.out.println("Recibo: ");
        System.out.println("Valor pago: " + getValorTotal());
        System.out.println("Pago: " + estaPago());

    }

}

