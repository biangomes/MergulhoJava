package modelo;

import java.math.BigDecimal;

public class Investimento extends Conta {

    public Investimento(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public void debitarTarifaMensal() {
        if (getSaldo().compareTo(new BigDecimal("10_000")) < 0) {
            sacar(new BigDecimal(30));
        }

    }
    public void creditarRendimentos(BigDecimal percentualJuros) {
        BigDecimal valorRendimento = getSaldo().multiply(percentualJuros).divide(new BigDecimal("100.00"));;
        depositar(valorRendimento);
    }
}
