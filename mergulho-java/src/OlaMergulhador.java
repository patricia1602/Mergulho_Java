public class OlaMergulhador {

    public static void main(String[] args) {
//        Imprimir msg
        System.out.println("Olá, mergulhador!");

        //Variável tipo String
        String nomeCompleto  = "Leonardo da Silva ";
//        nomeCompleto = "Manuela da Silva";

        System.out.println("Nome: " + nomeCompleto);

        //Variável tipo númerico
        int minhaIdade = 45;
        int suaIdade = 20;
        int totalIdade =  minhaIdade + suaIdade;
        System.out.println(totalIdade);

        double peso = 84.9;
        System.out.println(peso);

        float taxa = 1_294.93f;

        boolean comraAprovada = false;
        System.out.println(comraAprovada);

        boolean maiorDeIdade = minhaIdade > 18;
        System.out.println(maiorDeIdade);

    }
}
