package app;

import modelo.*;
import modelo.atm.CaixaEletronico;
import modelo.excecao.SaldoInsuficienteException;
import modelo.pagamento.Boleto;
import modelo.pagamento.DocumentoPagavel;
import modelo.pagamento.Holerite;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Beatriz");
        pessoa.setDocumento("02105460186");
        pessoa.setRendimentoAnual(new BigDecimal(15_000));
        //pessoa.setTipo(TIpoPessoa.FISICA);
        pessoa.setDataUltimaAtualizacao(LocalDateTime.parse("2023-09-27T13:20:00"));
        System.out.println(pessoa.getDataUltimaAtualizacao());


        Conta minhaConta = new Conta(pessoa, 64, 0664);
        Investimento suaConta = new Investimento(pessoa, minhaConta.getAgencia(), minhaConta.getNumero());
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        BigDecimal rendimento = pessoa.getRendimentoAnual();

        try {
            minhaConta.depositar(new BigDecimal(999));
            minhaConta.sacar(new BigDecimal(1_000));

            suaConta.depositar(new BigDecimal(15_000));
            suaConta.sacar(new BigDecimal(0.00));

            System.out.println("Conta de investimento: ");
            System.out.println("Saldo: " + suaConta.getSaldo());

            DocumentoPagavel boletoEscola = new Boleto(pessoa, new BigDecimal("200.00"));
            Holerite salarioFuncionario = new Holerite(pessoa, new BigDecimal("100.00"), 10);

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
