package ResistIC.Personagens.Monstros;
import java.util.Random;

import ResistIC.Personagens.Personagem;
import ResistIC.Suporte.ConsoleColors;
import ResistIC.itens.Armas.Arma;
import ResistIC.itens.Armas.Codeblade;
import ResistIC.itens.Armas.Data_rifle;
import ResistIC.itens.Armas.Turing_Hammer;

public abstract class Monstro extends Personagem 
{
    private int xpConcedido;

 
    private static final Arma[] listaDeArmasParaLargar = 
    {
        new Codeblade(10, 0),
        new Turing_Hammer(20, 1),
        new Data_rifle(30,2)
    };
    public Monstro(String nome, int pontosDeVida, int forca, int xpConcedido, Arma arma) 
    {
        super(nome, pontosDeVida, forca,arma);
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
    };
        
    public static Arma largaArma() 
    {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(listaDeArmasParaLargar.length);
        return listaDeArmasParaLargar[numeroAleatorio];
    };

}
