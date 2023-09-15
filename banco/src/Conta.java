public class Conta {

    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if ((saldo - valor) < 0) {
            throw new IllegalStateException("Saldo insuficiente.");
        }

        saldo -= valor;
    }
}
