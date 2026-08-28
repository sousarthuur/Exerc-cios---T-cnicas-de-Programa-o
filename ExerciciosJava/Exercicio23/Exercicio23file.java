package ExerciciosJava.Exercicio23;

public class Exercicio23file {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Marina";
        conta.numero = 12345;
        conta.saldo = 1000.00;

        conta.depositar(500.00);
        conta.sacar(200.00);

        conta.mostrarSaldo();

    }

}