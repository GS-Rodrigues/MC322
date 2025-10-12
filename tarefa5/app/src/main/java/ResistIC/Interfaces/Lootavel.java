package ResistIC.Interfaces;

/**
 * Representa qualquer entidade que pode deixar uma recompensa ({@code loot})
 * ao ser derrotada.
 *
 * <p>
 * A interface {@code Lootavel} define o comportamento básico de objetos ou
 * entidades que, ao serem eliminados, concedem um {@link Item} como
 * recompensa.
 * </p>
 *
 * @author Guilherme & Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public interface Lootavel {

    /**
     * Retorna o item de recompensa deixado pela entidade.
     *
     * <p>
     * O {@code Item} retornado representa o loot obtido ao derrotar a entidade.
     * </p>
     *
     * @return um objeto do tipo {@link Item} correspondente à recompensa obtida.
     */
    Item droparLoot();
}
