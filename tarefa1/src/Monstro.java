public abstract class Monstro extends Personagem 
{
    public int xpConcedido;
    
    public Monstro(String nome, int pontosDeVida, int forca, int xpConcedido) 
    {
        super(nome, pontosDeVida, forca);
        this.xpConcedido = xpConcedido;
    }

    @override
    public void exibirStatus() 
    {
    System.out.println("Nome: " + nome);
    System.out.println("Vida: " + pontosDeVida);
    System.out.println("Força: " + forca);
    System.out.println("XP concedido: " + xpConcedido);
    }

}
