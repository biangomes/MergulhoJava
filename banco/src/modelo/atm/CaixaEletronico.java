package modelo.atm;

import modelo.Conta;
import modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {

    public void imprimirSaldo(Conta conta) {
        System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo disponível: " + conta.getSaldoDisponivel());
    }

    public void pagar(DocumentoPagavel doc, Conta conta) {

        if (doc.estaPago()) {
            throw new IllegalStateException("O documento já está pago");
        }

        conta.sacar(doc.getValorTotal());
        doc.quitarPagamento();
    }
}
