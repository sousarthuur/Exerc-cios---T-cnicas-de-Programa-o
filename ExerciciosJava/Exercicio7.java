package ExerciciosJava;

public class Exercicio7 {

    public static void main(String[] args) {

        int A = 10;
        int B = 20;
        int temp;

        temp = A;
        A = B;
        B = temp;

        System.out.println("A = " + A);
        System.out.println("B = " + B);

    }

}