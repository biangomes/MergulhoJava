public class Main {
    public static void main(String[] args) {

        Conta contaItau = new Conta();
        contaItau.nomeTitular = "Beatriz Gomes";
        contaItau.agencia = 64;
        contaItau.numero = 0664;
        contaItau.saldo = 100.00;

        System.out.println("Nome do titular: " + contaItau.nomeTitular);
        System.out.println("Agencia: " + contaItau.agencia);
        System.out.println("Número: " + contaItau.numero);
        System.out.println("Saldo: " + contaItau.saldo);


        Conta contaDoConjuge = new Conta();
        contaDoConjuge.nomeTitular = "Ana Flávia";
        contaDoConjuge.agencia = 64;
        contaDoConjuge.numero = 0661;
        contaDoConjuge.saldo = 10_000;


        Conta contaFamilia = new Conta();
        contaFamilia.saldo = contaItau.saldo + contaDoConjuge.saldo;
        System.out.println(contaFamilia.saldo);
    }
}