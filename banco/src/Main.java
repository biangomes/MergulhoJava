public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Beatriz";
        pessoa.documento = "02105460186";

        Conta contaItau = new Conta();
        contaItau.titular = pessoa;
        contaItau.agencia = 64;
        contaItau.numero = 0664;
        contaItau.saldo = 100.00;

        System.out.println("Nome do titular: " + contaItau.titular.nome);
        System.out.println("Agencia: " + contaItau.agencia);
        System.out.println("Número: " + contaItau.numero);
        System.out.println("Saldo: " + contaItau.saldo);


        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Ana Flávia";
        pessoa2.documento = "300300300-30";

        Conta contaDoConjuge = new Conta();
        contaDoConjuge.titular = pessoa2;
        contaDoConjuge.agencia = 64;
        contaDoConjuge.numero = 0661;
        contaDoConjuge.saldo = 10_000;


        Conta contaFamilia = new Conta();
        contaFamilia.saldo = contaItau.saldo + contaDoConjuge.saldo;
        System.out.println(contaFamilia.saldo);
    }
}