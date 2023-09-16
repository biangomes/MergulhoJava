package app;

import modelo.Conta;
import modelo.ContaEspecial;
import modelo.Investimento;
import modelo.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Beatriz", "02105460186");
        Conta contaItau = new Conta(pessoa, 64, 0664);
        contaItau.depositar(99_000);
        contaItau.sacarComTaxa(1_000, 10);

        Investimento contaInvestimento = new Investimento(pessoa, contaItau.getAgencia(), contaItau.getNumero());

        contaInvestimento.depositar(15_000);
        contaInvestimento.creditarRendimentos(0.08);

        System.out.println("Conta de investimento: ");
        System.out.println("Saldo: " + contaInvestimento.getSaldo());

        ContaEspecial contaEspecial = new ContaEspecial(pessoa, 222, 333, 1_000);

        contaEspecial.depositar(15_000);
        contaEspecial.sacar(15_012);
    }
}