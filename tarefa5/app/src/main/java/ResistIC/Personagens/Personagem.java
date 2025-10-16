package ResistIC.Personagens;

import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.Suporte.ConsoleColors;
import ResistIC.itens.Armas.Arma;

/**
 * Classe abstrata que representa um personagem genérico.
 * 
 * <p>
 * Personagens possuem atributos básicos de combate, como vida, força e arma
 * equipada,
 * e podem receber dano, cura e exibir seu status. Subclasses concretas devem
 * implementar
 * a escolha de ação de combate específica.
 * </p>
 * 
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public abstract class Personagem implements Combatente {
    /** Nome do personagem */
    protected String nome;

    /** Pontos de vida atuais do personagem */
    protected int pontosDeVida;

    /** Força do personagem, usada para calcular dano */
    protected int forca;

    /** Arma atualmente equipada pelo personagem */
    protected Arma arma;

    /**
     * Constrói um personagem com nome, pontos de vida, força e arma inicial.
     *
     * @param nome         nome do personagem
     * @param pontosDeVida quantidade de vida do personagem
     * @param forca        força do personagem
     * @param arma         arma equipada inicialmente
     */
    public Personagem(String nome, int pontosDeVida, int forca, Arma arma) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.forca = forca;
        this.arma = arma;
    }

    /**
     * Aplica dano ao personagem, subtraindo dos pontos de vida.
     *
     * @param dano quantidade de dano a ser aplicada
     */
    public void receberDano(int dano) {
        pontosDeVida = pontosDeVida - dano;
    }

    /**
     * Aplica cura ao personagem, aumentando seus pontos de vida.
     *
     * @param cura quantidade de cura a ser aplicada
     */
    public void receberCura(int cura) {
        pontosDeVida = pontosDeVida + cura;
    }

    /**
     * Verifica se o personagem ainda está vivo.
     *
     * @return true se pontosDeVida > 0, false caso contrário
     */
    public boolean estaVivo() {
        return pontosDeVida > 0;
    }

    /**
     * Exibe o status completo do personagem, incluindo classe, nome, vida e força.
     */
    public void exibirStatus() {
        String classe = this.getClass().getSimpleName(); // pega só "Lehilton", não "class Lehilton"

        System.out.println(
                ConsoleColors.BLUE + "=============== STATUS PERSONAGEM ===============" + ConsoleColors.RESET);
        System.out.println("👤 Classe: " + ConsoleColors.ORANGE + classe + ConsoleColors.RESET);
        System.out.println("📛 Nome:   " + ConsoleColors.CYAN + nome + ConsoleColors.RESET);
        System.out.println("❤️ Vida:   " + ConsoleColors.RED + pontosDeVida + ConsoleColors.RESET);
        System.out.println("⚔️ Força:  " + ConsoleColors.GREEN + forca + ConsoleColors.RESET);
    }

    /**
     * Retorna o nome do personagem.
     *
     * @return nome do personagem
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna os pontos de vida atuais do personagem.
     *
     * @return pontos de vida
     */
    public int getVida() {
        return pontosDeVida;
    }

    /**
     * Retorna a força atual do personagem.
     *
     * @return valor da força
     */
    public int getForca() {
        return forca;
    }

    /**
     * Retorna a arma atualmente equipada pelo personagem.
     *
     * @return arma equipada
     */
    public Arma getArma() {
        return arma;
    }

    /**
     * Define uma nova arma para o personagem.
     *
     * @param novaArma arma que será equipada
     */
    public void setArma(Arma novaArma) {
        this.arma = novaArma;
    }

    /**
     * Método abstrato que define a lógica de escolha de ação de combate do
     * personagem.
     * Subclasses concretas devem implementar como o personagem decide atacar ou
     * usar habilidades.
     *
     * @param alvo combatente alvo da ação
     * @return ação de combate escolhida
     */
    public abstract AcaoDeCombate escolherAcao(Combatente alvo);

}
