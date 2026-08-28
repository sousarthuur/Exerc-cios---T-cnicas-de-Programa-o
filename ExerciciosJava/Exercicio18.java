package ExerciciosJava;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = entrada.nextLine();

        String iniciais = nome.substring(0, 1) + sobrenome.substring(0, 1);

        System.out.println("Iniciais: " + iniciais.toUpperCase());

        entrada.close();

    }

}