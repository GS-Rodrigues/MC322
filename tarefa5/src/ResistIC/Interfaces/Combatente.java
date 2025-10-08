package ResistIC.Interfaces;

import ResistIC.itens.Armas.Arma;

/**
 * Define o comportamento essencial de um combatente no RPG.
 *
 * <p>
 * Um {@code Combatente} pode atacar, receber dano, curar-se e escolher
 * uma ação de combate a ser executada contra outro combatente.
 * </p>
 *
 * <p>
 * Essa interface é implementada por entidades que participam de batalhas,
 * como heróis e monstros.
 * </p>
 *
 * @author Guilherme & Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public interface Combatente {

    /**
     * Retorna o nome do combatente.
     *
     * @return o nome do combatente
     */
    String getNome();

    /**
     * Verifica se o combatente ainda está vivo.
     *
     * @return {@code true} se o combatente estiver vivo, {@code false} caso
     *         contrário
     */
    boolean estaVivo();

    /**
     * Aplica dano ao combatente, diminuindo sua vida.
     *
     * @param dano quantidade de dano a ser recebida
     */
    void receberDano(int dano);

    /**
     * Aplica vida ao combatente, aumentando sua vida.
     *
     * @param cura quantidade de vida a ser recebida
     */
    void receberCura(int cura);

    /**
     * Escolhe uma ação de combate a ser executada contra um alvo.
     *
     * @param alvo o combatente inimigo que será alvo da ação
     * @return a ação de combate escolhida
     */
    AcaoDeCombate escolherAcao(Combatente alvo);

    /**
     * Retorna a quantidade de vida atual do combatente.
     *
     * @return quantidade de vida do combatente
     */
    public int getVida();

    /**
     * Retorna a força atual do combatente.
     *
     * @return força do combatente
     */
    public int getForca();

    /**
     * Retorna a arma equipada pelo combatente.
     *
     * @return a arma atual do combatente
     */
    public Arma getArma();

    /**
     * Retorna as possíveis descrições (frases) de ataque do combatente.
     *
     * @return um array de descrições de ataque
     */
    String[] getDescricoesDeAtaque();

}