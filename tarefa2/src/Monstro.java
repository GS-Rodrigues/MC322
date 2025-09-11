public abstract class Monstro extends Personagem 
{
    private int xpConcedido;
    
    public Monstro(String nome, int pontosDeVida, int forca, int xpConcedido, Arma arma) 
    {
        super(nome, pontosDeVida, forca, arma);
        this.xpConcedido = xpConcedido;
    }

    @Override
    public void exibirStatus() 
    {
        super.exibirStatus(); 
        System.out.println("XP concedido: " + xpConcedido);
        System.out.println(ConsoleColors.BLUE + "===============================================" + ConsoleColors.RESET);

    }
    
    public int getXpConcedido() 
        {
            return xpConcedido;
        }

}
