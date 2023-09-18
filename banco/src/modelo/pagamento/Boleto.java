package modelo.pagamento;

import modelo.Pessoa;

import java.math.BigDecimal;

public class Boleto implements DocumentoPagavel {

    private Pessoa beneficiario;
    private BigDecimal valor;
    private boolean estaPago;

    public Boleto(Pessoa beneficiario, BigDecimal valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;
    }

    @Override
    public BigDecimal getValorTotal() {
        return valor;
    }

    @Override
    public boolean estaPago() {
        return estaPago;
    }

    @Override
    public void quitarPagamento() {
        estaPago = true;
    }
}
