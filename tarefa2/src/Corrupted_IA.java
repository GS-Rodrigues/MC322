import java.util.Random;

public class Corrupted_IA extends Monstro 
{
    public Corrupted_IA(String nome, int pontosDeVida, int forca, Arma arma) 
    {
        super(nome, pontosDeVida, forca, 100, arma);
    }

    private static final String[] ataques = 
    {
        "lança um ataque de código corrompido!",
        "sobrecarrega o sistema com loops infinitos!",
        "injeta vírus digitais devastadores!",
        "distorce a realidade virtual e causa instabilidade!",
        "emite uma onda de dados corrompidos que frita circuitos!"
    };

    Random gerador = new Random();


    
    @Override
    public void atacar(Personagem alvo) 
    {
        String ataque = ataques[gerador.nextInt(ataques.length)];
        System.out.printf("%-20s -> %-40s (dano: %d) | Vida do Heroi: %d\n", this.getNome(), ataque, this.getForca(), alvo.getVida());
        alvo.receberDano(this.getForca());
    }

}
