package ExerciciosJava;

public class Exercicio13 {

    public static void main(String[] args) {

        int totalSegundos = 7384;

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

    }

}