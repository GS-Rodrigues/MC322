package ResistIC.Logica;

/**
 * Representa os níveis de dificuldade do jogo, definindo modificadores
 * para os atributos dos monstros e variações na sorte do herói.
 *
 * <p>
 * Cada nível possui:
 * <ul>
 * <li>{@code multiplicador_forca_vida_monstro}: fator que ajusta a vida
 * e força dos monstros.</li>
 * <li>{@code variacao_sorte_heroi}: ajuste na sorte do herói.</li>
 * </ul>
 * </p>
 */
public enum Dificuldade {
    FACIL(0.75, 0.2),
    NORMAL(1.0, 0.0),
    DIFICIL(1.5, -0.2);

    /** Fator de aumento/redução da vida e da força do monstro. */
    private final double multiplicador_forca_vida_monstro;

    /** Variação aplicada na sorte do herói. */
    private final double variacao_sorte_heroi;

    /**
     * Retorna o multiplicador aplicado à vida e força dos monstros.
     *
     * @return valor do multiplicador.
     */
    public double getMultiplicadorForcaVidaMonstro() {
        return multiplicador_forca_vida_monstro;
    }

    /**
     * Retorna a variação aplicada à sorte do herói.
     *
     * @return valor da variação da sorte.
     */
    public double getVariacaoSorteHeroi() {
        return variacao_sorte_heroi;
    }

    /**
     * Construtor do enum {@code Dificuldade}.
     *
     * @param multiplicador_forca_vida_monstro fator de ajuste de vida/força dos
     *                                         monstros.
     * @param variacao_sorte_heroi             ajuste aplicado à sorte do herói.
     */
    Dificuldade(double multiplicador_forca_vida_monstro, double variacao_sorte_heroi) {
        this.multiplicador_forca_vida_monstro = multiplicador_forca_vida_monstro;
        this.variacao_sorte_heroi = variacao_sorte_heroi;
    }
}
