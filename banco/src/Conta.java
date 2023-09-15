public class Conta {

    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

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
}
