public class CalculadoraJurosCompostoTempo {

    public static void main(String[] args) {

        double valorAcumulado = 10_000;
        double taxaJuroMensal = 0.8;
        int periodoEmMeses = 12;

        for (int mes =1; mes <= periodoEmMeses; mes++) {
            valorAcumulado += valorAcumulado * taxaJuroMensal / 100;
            System.out.println("Mês " + mes + " = " + valorAcumulado);
        }
    }
}
