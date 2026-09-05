package AtividadeAutoestudo.exercicio2heranca;

public class Podcast extends Conteudo {
    public String apresentador;

    public Podcast(String titulo, int duracaoMinutos, String apresentador) {
        super(titulo, duracaoMinutos);
        this.apresentador = apresentador;
    }

    public void ouvirPodcast() {
        System.out.println("Podcast apresentado por " + apresentador + ".");
    }
}