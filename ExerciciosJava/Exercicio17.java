package ExerciciosJava;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = entrada.nextLine();

        String nomeCompleto = nome + " " + sobrenome;

        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Em maiúsculas: " + nomeCompleto.toUpperCase());
        System.out.println("Quantidade de caracteres: " + nomeCompleto.length());

        entrada.close();

    }

}