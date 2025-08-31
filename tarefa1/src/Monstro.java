public abstract class Monstro extends Personagem 
{
    public Monstro(String nome, int pontosDeVida, int forca) 
    {
        super(nome, pontosDeVida, forca);
    }

    public int xpConcedido;

    @override
    public void exibirStatus() 
    {
    System.out.println("Nome: " + nome);
    System.out.println("Vida: " + pontosDeVida);
    System.out.println("Força: " + forca);
    System.out.println("XP concedido: " + xpConcedido);
    }

}
