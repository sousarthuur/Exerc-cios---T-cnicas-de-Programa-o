package AtividadeAutoestudo.exercicio2heranca;

public class Main {
    public static void main(String[] args) {
        VideoAula video = new VideoAula("Encapsulamento", 40, "Teams");
        Podcast podcast = new Podcast("Herança em Java", 25, "Mariana");

        video.exibirResumo();
        podcast.exibirResumo();

        video.reproduzirVideo();
        podcast.ouvirPodcast();
    }
}