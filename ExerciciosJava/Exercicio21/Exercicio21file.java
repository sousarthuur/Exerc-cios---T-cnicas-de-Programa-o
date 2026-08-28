package ExerciciosJava.Exercicio21;

public class Exercicio21file {

    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.nome = "Notebook";
        produto1.preco = 3000.00;
        produto1.quantidade = 5;

        Produto produto2 = new Produto();

        produto2.nome = "Mouse";
        produto2.preco = 80.00;
        produto2.quantidade = 10;

        produto1.mostrarDados();

        System.out.println();

        produto2.mostrarDados();

    }

}