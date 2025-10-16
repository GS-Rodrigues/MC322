package ResistIC.Interfaces;

/**
 * Representa um item que pode existir no jogo.
 *
 * <p>
 * Um {@code Item} possui um nome que o identifica, podendo ser utilizado em
 * diferentes contextos do RPG.
 * </p>
 *
 * <p>
 * Esta interface pode ser implementada por diversos tipos de itens, como armas,
 * equipamentos, etc
 * </p>
 *
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public interface Item {
    /**
     * Retorna o nome do item.
     *
     * <p>
     * O nome identifica o {@code Item} dentro do jogo.
     * </p>
     *
     * @return uma {@code String} contendo o nome do item.
     */
    String getNome();
}
