package modelo.pagamento;

import modelo.Pessoa;

public class Boleto implements DocumentoPagavel {

    private Pessoa beneficiario;
    private double valor;
    private boolean estaPago;

    public Boleto(Pessoa beneficiario, double valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;
    }

    @Override
    public double getValorTotal() {
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
