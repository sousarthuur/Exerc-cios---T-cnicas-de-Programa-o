public class Carro {
    String marca;
    String cor;
    String modelo;
    int ano;
    String combustivel;
    boolean ligado;
    int velocidade;

    void acelerar() {
        velocidade += 10;
    }

    void frear() {
        velocidade -= 10;
    }
    
    void ligar() {
        ligado = true;
        System.out.println("carro ligado.");
    }

    void desligar() {
        ligado = false;
    }

    void buzinar() {
        System.out.println("Biiiip!!!");
    }

    void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Ligado: " + ligado);
        System.out.println("Ano: " + ano);
        System.out.println("Combustível: " + combustivel);
    }

}