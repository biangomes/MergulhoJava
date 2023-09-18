package modelo;

import java.util.Objects;

public class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta() {}

    public Conta(Pessoa titular, int agencia, int numero) {
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Conta(double saldo) {
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

    public double getSaldoDisponivel() {
        return getSaldo();
    }

    public void depositar(double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser maior que zero");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser maior que zero.");
        }

        if (getSaldoDisponivel() - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente.");
        }

        this.saldo -= valor;
    }

    public void sacarComTaxa(double valor, double taxaSaque) {
        sacar(valor + taxaSaque);
    }

    public void debitarTarifaMensal() {
        sacar(saldo);
    }
}
