package modelo.pagamento;

import modelo.Pessoa;

public class Holerite implements DocumentoPagavel {

    private Pessoa funcionario;
    private double valorHora;
    private int quantidadeHoras;
    private boolean estaPago;

    public Holerite(Pessoa funcionario, double valorHora, int quantidadeHoras) {
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public double getValorTotal() {
        return valorHora * quantidadeHoras;
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
