import java.util.Random;

public class Corrupted_IA extends Monstro 
{
    private static final String[] ataques = 
    {
        "lança um ataque de código corrompido!",
        "sobrecarrega o sistema com loops infinitos!",
        "injeta vírus digitais devastadores!",
        "distorce a realidade virtual e causa instabilidade!",
        "emite uma onda de dados corrompidos que frita circuitos!"
    }
    
    public Corrupted_IA(String nome, int pontosDeVida, int forca) 
    {
        super(nome, pontosDeVida, forca, 100);
    }

    @Override
    protected void atacar(Personagem alvo) 
    {
        String ataque = ataques[random.nextInt(ataques.length)]
        System.out.println(this.getNome() + " " + ataque;
        alvo.receberDano(this.getForca());
    }
}
