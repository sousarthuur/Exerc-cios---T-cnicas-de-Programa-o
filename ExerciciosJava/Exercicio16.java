package ExerciciosJava;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Curso: ");
        String curso = entrada.nextLine();

        System.out.println("\n--- FICHA ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);

        entrada.close();

    }

}