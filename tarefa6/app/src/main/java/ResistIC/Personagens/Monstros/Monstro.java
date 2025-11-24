package ResistIC.Personagens.Monstros;

import java.util.Random;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import ResistIC.Interfaces.Lootavel;
import ResistIC.Personagens.Personagem;
import ResistIC.Suporte.ConsoleColors;
import ResistIC.itens.Armas.Arma;
import ResistIC.itens.Armas.Codeblade;
import ResistIC.itens.Armas.Data_rifle;
import ResistIC.itens.Armas.Turing_Hammer;

/**
 * Classe abstrata que representa um monstro.
 *
 * <p>
 * Monstros possuem atributos de combate (vida, força), concedem experiência ao
 * serem derrotados e podem largar armas como loot. As subclasses concretas
 * definem comportamento, ataques e história específica de cada monstro.
 * </p>
 * 
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-08
 */

@XmlRootElement
@XmlSeeAlso({Canvaspecter.class, Chronoloop.class, Genomex.class})
public abstract class Monstro extends Personagem implements Lootavel {
    private int xpConcedido;

    private static final Arma[] listaDeArmasParaLargar = {
            new Codeblade(),
            new Turing_Hammer(),
            new Data_rifle(30, 2)
    };

    /**
     * Construtor da classe Monstro.
     *
     * @param nome         nome do monstro
     * @param pontosDeVida quantidade de vida do monstro
     * @param forca        força do monstro
     * @param xpConcedido  experiência concedida ao ser derrotado
     * @param arma         arma equipada pelo monstro
     */

    public Monstro() {
        super();
    }

    public Monstro(String nome, int pontosDeVida, int forca, int xpConcedido, Arma arma) {
        super(nome, pontosDeVida, forca, arma);
        this.xpConcedido = xpConcedido;
    }

    /**
     * Exibe o status do monstro.
     */
    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("XP concedido: " + xpConcedido);
        System.out
                .println(ConsoleColors.BLUE + "===============================================" + ConsoleColors.RESET);
    }

    @XmlElement
    public int getXpConcedido() {
        return xpConcedido;
    }
    public void setXpConcedido(int xpConcedido) {
        this.xpConcedido = xpConcedido;
    }

    /**
     * Retorna uma arma aleatória da lista de loot do monstro.
     *
     * @return arma sorteada
     */
    public static Arma largaArma() {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(listaDeArmasParaLargar.length);
        return listaDeArmasParaLargar[numeroAleatorio];
    };

    /**
     * Ajusta a vida do monstro aplicando um fator de variação.
     *
     * @param fatorDeVariacao fator a ser aplicado na vida
     */
    public void setPontosDeVida(double fatorDeVariacao) {
        this.pontosDeVida = (int) (pontosDeVida * fatorDeVariacao);
    }

    /**
     * Ajusta a força do monstro aplicando um fator de variação.
     *
     * @param fatorDeVariacao fator a ser aplicado na força
     */
    public void setForca(double fatorDeVariacao) {
        this.forca = (int) (forca * fatorDeVariacao);
    }

}
