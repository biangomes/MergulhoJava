package app;

import modelo.*;
import modelo.atm.CaixaEletronico;
import modelo.excecao.SaldoInsuficienteException;
import modelo.pagamento.Boleto;
import modelo.pagamento.DocumentoPagavel;
import modelo.pagamento.Holerite;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Beatriz");
        pessoa.setDocumento("02105460186");
        pessoa.setRendimentoAnual(15_000d);
        //pessoa.setTipo(TIpoPessoa.FISICA);
        pessoa.setDataUltimaAtualizacao(LocalDateTime.parse("2023-09-27T13:20:00"));
        System.out.println(pessoa.getDataUltimaAtualizacao());


        Conta minhaConta = new Conta(pessoa, 64, 0664);
        Investimento suaConta = new Investimento(pessoa, minhaConta.getAgencia(), minhaConta.getNumero());
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        double rendimento = pessoa.getRendimentoAnual();

        try {
            minhaConta.depositar(999);
            minhaConta.sacar(1_000);

            suaConta.depositar(15_000);
            suaConta.sacar(0.08);

            System.out.println("Conta de investimento: ");
            System.out.println("Saldo: " + suaConta.getSaldo());

            DocumentoPagavel boletoEscola = new Boleto(pessoa, 200.00);
            Holerite salarioFuncionario = new Holerite(pessoa, 100, 10);

            caixaEletronico.pagar(boletoEscola, minhaConta);
            caixaEletronico.pagar(salarioFuncionario, minhaConta);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao executar operação na conta: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no argumento da conta: " + e.getMessage());
        }

        caixaEletronico.imprimirSaldo(minhaConta);
        System.out.println();
        caixaEletronico.imprimirSaldo(suaConta);
    }
}
