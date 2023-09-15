public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Beatriz", "02105460186");

        Conta contaItau = new Conta(pessoa, 64, 0664);
        contaItau.saldo = 1000.00;
        contaItau.depositar(99_000);
        contaItau.sacarComTaxa(1_000, 10);


        System.out.println("Nome do titular: " + contaItau.titular.nome);
        System.out.println("Agencia: " + contaItau.agencia);
        System.out.println("Número: " + contaItau.numero);
        System.out.println("Saldo: " + contaItau.saldo);


        Pessoa pessoa2 = new Pessoa("Ana Flávia", "30030030030");


        Conta contaDoConjuge = new Conta(pessoa2, 64, 0661);
        contaDoConjuge.saldo = 10_000;
        contaDoConjuge.saldo = 80_000;

        Conta contaFamilia = new Conta(contaItau.saldo + contaDoConjuge.saldo);
        System.out.println(contaFamilia.saldo);


        // Testando Objects.requireNonNull
        Conta contaDoFilho = new Conta(new Pessoa("Arthur", "90090090009"), 64, 01354);
        System.out.println("Conta do filho: " + contaDoFilho.titular.nome);
    }
}