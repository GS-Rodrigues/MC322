public abstract class Monstro extends Personagem 
{
    private int xpConcedido;

 
    private static final Arma[] listaDeArmasParaLargar = 
    {
        new Codeblade(10, 0),
        new Turing_Hammer(20, 1),
        new Data_rifle(20,2)
    };
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
