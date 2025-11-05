import java.util.Random;

public class Dado {
    private int lados;         // Quantos lados o dado tem
    private Random random;     // Gerador de números aleatórios

    // Construtor
    public Dado(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    // Método para rolar o dado e retornar um número entre 1 e "lados"
    public int roll() {
        return random.nextInt(lados) + 1;
    }

}