package ResistIC.Logica;

import ResistIC.Suporte.ConsoleColors;

/**
 * Representa os tipos de cenário do jogo.
 *
 * <p>
 * Cada {@code TipoCenario} corresponde a um instituto específico,
 * contendo sua área de conhecimento e o tipo de ataque característico
 * dos inimigos que o habitam.
 * </p>
 *
 * <ul>
 * <li>{@link #INSTITUTO_DE_EXATAS} – área de Exatas, ataques numéricos.</li>
 * <li>{@link #INSTITUTO_DE_HUMANAS} – área de Humanas, ataques de
 * persuasão.</li>
 * <li>{@link #INSTITUTO_DE_BIOLOGICAS} – área de Biológicas, ataques a
 * estruturas orgânicas.</li>
 * </ul>
 *
 * @author Guilherme & Giovani
 * @version 1.0
 * @since 2025-10-12
 */
public enum TipoCenario {
    INSTITUTO_DE_EXATAS("EXATAS", "ATAQUES NUMÉRICOS"),
    INSTITUTO_DE_HUMANAS("HUMANAS", "ATAQUES DE PERSUASÃO"),
    INSTITUTO_DE_BIOLOGICAS("BIOLÓGICAS", "ATAQUES ÀS ESTRUTURAS ORGÂNICAS");

    /** Área do conhecimento principal do instituto. */
    private final String areaDoConhecimento;

    /** Essência do ataque do inimigo do instituto. */
    private final String tipoDeAtaque;

    /**
     * Construtor do enum {@code TipoCenario}.
     *
     * @param areaDoConhecimento área do conhecimento principal do instituto.
     * @param tipoDeAtaque       tipo de ataque característico dos inimigos do
     *                           instituto.
     */
    TipoCenario(String areaDoConhecimento, String tipoDeAtaque) {
        this.areaDoConhecimento = areaDoConhecimento;
        this.tipoDeAtaque = tipoDeAtaque;
    }

    /**
     * Exibe informações sobre o cenário e seus inimigos.
     */
    public void apresentarInformacoesCenario() {
        System.out.println(ConsoleColors.CYAN + "Área do conhecimento do prédio/instituto: " + ConsoleColors.RESET
                + areaDoConhecimento);
        System.out.println("Especialidade dos inimigos: " + tipoDeAtaque);
        System.out.println();
    }
}
