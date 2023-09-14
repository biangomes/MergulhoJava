public class OlaMergulhador {

    public static void main(String[] args) {

        System.out.println("olá, mergulhador!");

        String nomeCompleto;
        nomeCompleto = "Beatriz Gomes";

        System.out.println("Nome do programador: " + nomeCompleto);

        double peso = 86.0;
        System.out.println(peso);

        float taxa = 1_294.93f;

        boolean compraAprovada = false;
        System.out.println(compraAprovada);

        int minhaIdade = 25;
        boolean maiorIdade = minhaIdade > 18;

        if (maiorIdade) {
            System.out.println("maior idade");
        } else {
            System.out.println("menor de idade");
        }
    }
}
