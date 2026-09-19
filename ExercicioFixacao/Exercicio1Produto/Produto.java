public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void alterarPreco(double novoPreco) {
        if (novoPreco >= 0) {
            preco = novoPreco;
        } else {
            System.out.println("Preço inválido.");
        }
    }

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            quantidade += qtd;
        } else {
            System.out.println("Quantidade inválida.");
        }
    }

    public void retirarEstoque(int qtd) {
        if (qtd > 0 && qtd <= quantidade) {
            quantidade -= qtd;
        } else {
            System.out.println("Retirada de estoque inválida.");
        }
    }

    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    public void mostrarDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor em estoque: R$ " + calcularValorEstoque());
    }
}
