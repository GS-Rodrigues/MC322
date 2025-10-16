package ResistIC.itens.Armas;

import ResistIC.Interfaces.Item;
import ResistIC.Personagens.Herois.Heroi;

/**
 * Representa uma arma que pode ser utilizada por um {@link Heroi}.
 *
 * <p>
 * A classe abstrata {@code Arma} implementa a interface {@link Item} e define
 * os
 * atributos e comportamentos básicos de qualquer tipo de arma, como dano e
 * nível mínimo necessário para seu uso. Cada tipo específico de arma
 * estende esta classe e implementar o método {@link #info()}.
 * </p>
 *
 * <p>
 * O nome da arma é automaticamente definido com base no nome da classe que a
 * representa.
 * </p>
 *
 * <p>
 * Exemplos de subclasses incluem: {@link Codeblade}, {@link Data_rifle},
 * {@link Turing_Hammer}, entre outros.
 * </p>
 *
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public abstract class Arma implements Item {
    private int dano;
    private int minNivel;
    private String nome;

    /**
     * Cria uma nova arma com o dano e o nível mínimo especificados.
     *
     * @param dano     o valor de dano que a arma causa.
     * @param minNivel o nível mínimo necessário para equipa-la.
     */
    public Arma(int dano, int minNivel) {
        this.dano = dano;
        this.minNivel = minNivel;
        this.nome = this.getClass().getSimpleName();
    }

    /**
     * Exibe informações detalhadas sobre a arma.
     *
     * <p>
     * Cada tipo de arma deve implementar este método para mostrar suas
     * características específicas.
     * </p>
     */
    public abstract void info();

    /**
     * Retorna o dano causado pela arma.
     *
     * @return um {@code int} representando o dano da arma.
     */
    public int getdano() {
        return dano;
    }

    /**
     * Define um novo valor de dano para a arma.
     *
     * @param novoDano o valor de dano a ser atribuído a arma.
     */
    public void setDano(int novoDano) {
        this.dano = novoDano;
    }

    /**
     * Retorna o nível mínimo necessário para equipar a arma.
     *
     * @return um {@code int} representando o nível mínimo exigido.
     */
    public int getminNivel() {
        return minNivel;
    }

    /**
     * Retorna o nome da arma.
     *
     * <p>
     * O nome é automaticamente definido com base no nome da classe concreta que
     * representa a arma.
     * </p>
     *
     * @return uma {@code String} contendo o nome da arma.
     */
    public String getNome() {
        return this.nome;
    }

}
