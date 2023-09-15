public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Beatriz", "02105460186");

        Conta contaItau = new Conta(pessoa, 64, 0664, 1000.00);
        contaItau.depositar(99_000);
        contaItau.sacarComTaxa(1_000, 10);


        System.out.println("Nome do titular: " + contaItau.getTitular().getNome());
        System.out.println("Agencia: " + contaItau.getAgencia());
        System.out.println("Número: " + contaItau.getNumero());
        System.out.println("Saldo: " + contaItau.getSaldo());

        Pessoa pessoa2 = new Pessoa("Ana Flávia", "30030030030");


        // Testando Objects.requireNonNull
        Conta contaDoFilho = new Conta(new Pessoa("Arthur", "90090090009"), 64, 01354, 100.00);
        System.out.println("Conta do filho: " + contaDoFilho.getTitular().getNome());
    }
}