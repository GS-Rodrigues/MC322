package ResistIC.Interfaces;

/**
 * Define o comportamento basico de uma ação de combate entre dois
 * {@link Combatente} no RPG.
 *
 * <p>
 * Uma {@code AcaoDeCombate} pode executar um ataque, uma cura, etc...
 * </p>
 *
 * <p>
 * Essa interface é implementada por açoes que um {@link Combatente} pode
 * desferir em outro combatente.
 * </p>
 *
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public interface AcaoDeCombate {

    /**
     * Executa uma Ação do {@link Combatente} Usuário contra o Combatente alvo.
     *
     * @param usuario {@code Combatente} que irá realizar a ação contra o alvo.
     * @param alvo    {@code Combatente} que irá ser atingido com a ação do usuario
     */
    void executar(Combatente usuario, Combatente alvo);
}
