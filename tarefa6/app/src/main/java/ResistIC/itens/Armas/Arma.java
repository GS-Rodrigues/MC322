package ResistIC.itens.Armas;

import javax.xml.bind.annotation.*;

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
@XmlRootElement
@XmlSeeAlso({Codeblade.class, Data_rifle.class, Turing_Hammer.class, Cortex_Distorter.class, PixelStorm.class, Quanta_Cutter.class})
public abstract class Arma implements Item {
    private int dano;
    private int minNivel;
    private String nome;

    public Arma() {
    }

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

    @XmlElement
    public int getdano() {
        return dano;
    }
    public void setDano(int novoDano) {
        this.dano = novoDano;
    }

    @XmlElement
    public int getminNivel() {
        return minNivel;
    }
    public void setMinNivel(int minNivel) {
        this.minNivel = minNivel;
    }

    @XmlElement
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
