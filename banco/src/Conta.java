import java.util.Objects;

public class Conta {

    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

    Conta() {}

    Conta(Pessoa titular, int agencia, int numero) {
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    Conta(double saldo) {
        this.saldo = saldo;
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
