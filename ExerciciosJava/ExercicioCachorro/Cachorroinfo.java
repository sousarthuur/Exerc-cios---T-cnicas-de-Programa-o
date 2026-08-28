package ExerciciosJava.ExercicioCachorro;

public class Cachorroinfo {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Rex";
        cachorro.idade = 3;

        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Idade: " + cachorro.idade);

        cachorro.latir();

    }

}