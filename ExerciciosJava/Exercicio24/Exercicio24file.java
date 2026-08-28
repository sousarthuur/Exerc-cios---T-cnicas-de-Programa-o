package ExerciciosJava.Exercicio24;

public class Exercicio24file {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.cor = "Branca";

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();

    }

}