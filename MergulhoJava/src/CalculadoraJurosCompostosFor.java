public class CalculadoraJurosCompostosFor {
    public static void main(String[] args) {

        double valorAcumulado = 10_000;
        // taxaJurosMensal: taxa de juros mensal que rende ao investimento do valorAcumulado
        double taxaJurosMensal = 0.8;
        int periodoEmMeses = 12;
        double delta = valorAcumulado;
        double lucro = 0.0;

        for (int mes = 1; mes <= periodoEmMeses; mes++) {
            valorAcumulado += valorAcumulado * taxaJurosMensal / 100;
            lucro = valorAcumulado - delta;
            System.out.println("Mês " + mes + " = " + valorAcumulado);
        }
        System.out.println("Lucro: R$" + lucro);
    }
}
