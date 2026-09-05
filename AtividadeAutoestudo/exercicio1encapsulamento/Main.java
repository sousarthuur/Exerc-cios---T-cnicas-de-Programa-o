package AtividadeAutoestudo.exercicio1encapsulamento;

public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho("Viagem");

        cofrinho.depositar(500);
        cofrinho.depositar(200);
        cofrinho.retirar(150);
        cofrinho.retirar(1000);      // deve ser rejeitada
        cofrinho.depositar(-50);     // deve ser rejeitada
        cofrinho.mostrarResumo();
    }
}