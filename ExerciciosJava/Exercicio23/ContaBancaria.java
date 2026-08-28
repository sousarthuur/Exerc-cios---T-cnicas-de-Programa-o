package ExerciciosJava.Exercicio23;

public class ContaBancaria {

    String titular;
    int numero;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    void sacar(double valor) {
        saldo = saldo - valor;
    }

    void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$ " + saldo);
    }

}