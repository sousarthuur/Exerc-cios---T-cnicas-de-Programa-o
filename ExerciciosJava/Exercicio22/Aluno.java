package ExerciciosJava.Exercicio22;

public class Aluno {

    String nome;
    double primeiraNota;
    double segundaNota;

    double calcularMedia() {
        return (primeiraNota + segundaNota) / 2;
    }

    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Primeira nota: " + primeiraNota);
        System.out.println("Segunda nota: " + segundaNota);
        System.out.println("Média: " + calcularMedia());
    }

}