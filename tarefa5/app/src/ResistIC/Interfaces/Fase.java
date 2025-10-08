package ResistIC.Interfaces;

import ResistIC.Logica.TipoCenario;
import ResistIC.Personagens.Herois.Heroi;

/**
 * Define o comportamento básico de uma {@code Fase} em um RPG.
 *
 * <p>
 * Uma {@code Fase} sempre precisa de um {@link Heroi} e de um cenário para ser
 * iniciada.
 * </p>
 *
 * <p>
 * Esta interface pode ser implementada por diferentes tipos de fases de uma
 * partida,
 * como, por exemplo, uma fase de combate.
 * </p>
 *
 * @author Guilherme & Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public interface Fase {

    /**
     * Inicia a fase com o herói fornecido.
     *
     * @param heroi o {@link Heroi} que participará da fase
     */
    void iniciar(Heroi heroi);

    /**
     * Retorna o tipo de cenário associado a esta fase.
     *
     * @return o {@link TipoCenario} desta fase
     */
    TipoCenario getTipoDeCenario();

    // /**
    // * Verifica se a fase foi concluída.
    // *
    // * @return {@code true} se a fase estiver concluída, {@code false} caso
    // contrário
    // */
    // boolean isConcluida();
}
