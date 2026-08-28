package ExerciciosJava.Exercicio24;

public class Lampada {

    String cor;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        System.out.println("Cor: " + cor);

        if (ligada) {
            System.out.println("Estado: Ligada");
        } else {
            System.out.println("Estado: Desligada");
        }
    }

}