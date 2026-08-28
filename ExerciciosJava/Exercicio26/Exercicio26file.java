package ExerciciosJava.Exercicio26;

public class Exercicio26file {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        conta1.titular = "Marina";
        conta1.numero = 1001;
        conta1.saldo = 1000.00;

        conta2.titular = "João";
        conta2.numero = 1002;
        conta2.saldo = 500.00;

        conta1.depositar(300.00);
        conta1.sacar(100.00);

        conta2.depositar(200.00);
        conta2.sacar(50.00);

        System.out.println("Conta 1:");
        conta1.mostrarSaldo();

        System.out.println();

        System.out.println("Conta 2:");
        conta2.mostrarSaldo();

    }

}