import java.util.Objects;

public class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

    Conta() {}

    Conta(Pessoa titular, int agencia, int numero, double saldo) {
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    Conta(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    void depositar(double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser maior que zero");
        }
        saldo += valor;
    }

    void sacar(double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser maior que zero.");
        }

        if (saldo - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente.");
        }

        saldo -= valor;
    }


    void sacarComTaxa(double valor, double taxaSaque) {
        sacar(valor + taxaSaque);
    }
}
