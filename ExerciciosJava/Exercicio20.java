package ExerciciosJava;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = entrada.nextLine();

        System.out.println("Tamanho: " + palavra.length());
        System.out.println("Primeiro caractere: " + palavra.charAt(0));
        System.out.println("Último caractere: " + palavra.charAt(palavra.length() - 1));

        entrada.close();

    }

}