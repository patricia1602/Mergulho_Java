public class Principal {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.nome =  "Manuela";
        titular1.documento = "23452323231";

       Pessoa titular2 = new Pessoa();
       titular2.nome = "Leonardo";
       titular2.documento = " 87656754312";

        Conta minhaConta =  new Conta(titular1, 123-5,1234);
        //minhaConta.titular = titular1;
        //minhaConta.agencia = 123-5;
        //minhaConta.numero = 1234;
        //minhaConta.saldo = 1_000;

        Conta suaConta = new Conta();
        suaConta.titular= titular2;
        suaConta.agencia = 7890-3;
        suaConta.numero = 765;
        suaConta.saldo = 1_000;

        minhaConta.depositar(15_000);
        suaConta.depositar(10_000);

        minhaConta.sacar(1_000,10);

        System.out.println("Titular : " + minhaConta.titular.nome);
        System.out.println("Saldo : " + minhaConta.saldo);

        System.out.println("Titular : " + suaConta.titular.nome);
        System.out.println("Saldo : " + suaConta.saldo);

    }
}
