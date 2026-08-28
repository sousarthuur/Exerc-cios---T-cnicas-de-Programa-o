package ExerciciosJava.Exercicio21;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    double calcularValorEstoque() {
        return preco * quantidade;
    }

    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor em estoque: R$ " + calcularValorEstoque());
    }

}