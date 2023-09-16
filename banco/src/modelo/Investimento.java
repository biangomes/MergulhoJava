package modelo;

public class Investimento extends Conta {

    public Investimento(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public void creditarRendimentos(double percentualJuros) {
        double valorRendimento = getSaldo() * percentualJuros / 100;
        depositar(valorRendimento);
    }
}
