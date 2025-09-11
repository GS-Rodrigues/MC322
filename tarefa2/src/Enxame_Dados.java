import java.util.Random;

public class Enxame_Dados extends Monstro 
{
    private static final String[] ataques = 
    {
    "invade o sistema, corrompendo suas defesas!",
    "lança milhares de pacotes binários como insetos digitais contra você!",
    "te envolve em uma nuvem caótica de informação letal!",
    "lança fragmentos de código em fúria em você sem piedade!",
    "sobrecarrega seus circuitos com loops infinitos!",
    "lança uma tempestade de bits envenenados que drenam sua energia vital!"
    };

    Random gerador = new Random();
    
    public Enxame_Dados(String nome, int pontosDeVida, int forca, Arma arma) 
    {
        super(nome, pontosDeVida, forca, 100, arma);
    }
    
    @Override
    public void atacar(Personagem alvo) 
    {
        String ataque = ataques[gerador.nextInt(ataques.length)];
        System.out.printf("%-20s -> %-40s (dano: %d) | Vida do Heroi: %d\n", this.getNome(), ataque, this.getForca(), alvo.getVida());
        alvo.receberDano(this.getForca());
    }

}
