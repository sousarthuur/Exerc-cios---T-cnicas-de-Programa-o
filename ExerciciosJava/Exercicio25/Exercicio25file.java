package ExerciciosJava.Exercicio25;

public class Exercicio25file {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();

        circulo.raio = 5.0;

        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Circunferência: " + circulo.calcularCircunferencia());

    }

}