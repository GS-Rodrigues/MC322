package ResistIC.itens.Armas;

import javax.xml.bind.annotation.XmlRootElement;

import ResistIC.Suporte.ConsoleColors;

/**
 * Representa a {@code Data_rifle}, uma arma de longo alcance que dispara
 * pulsos de dados comprimidos capazes de sobrecarregar circuitos neurais de
 * IAs.
 *
 * <p>
 * Criada pelos engenheiros da Resistência a partir de antenas de comunicação
 * antigas,
 * a {@code Data_rifle} é uma ferramenta versátil usada tanto para combate
 * quanto para sabotagem de sistemas automatizados.
 * </p>
 *
 * <p>
 * O {@code Data_rifke} herda os comportamentos básicos da classe {@link Arma} e
 * sobrescreve o método {@link #info()}.
 * </p>
 * 
 * <p>
 * Seu dano e nível mínimo são configuráveis, tornando-a uma escolha adaptável
 * para diferentes estratégias de combate cibernético.
 * </p>
 *
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-08
 */
@XmlRootElement
public class Data_rifle extends Arma {

    /**
     * Cria uma nova {@code Data_rifle} com os parâmetros especificados.
     *
     * @param dano     o dano causado por disparo.
     * @param minNivel o nível mínimo necessário para utilizá-la.
     */

    public Data_rifle() {
    super(30,2);
    }
    public Data_rifle(int dano, int minNivel) {
        super(dano, minNivel);
    }

    /**
     * Exibe informações detalhadas sobre a {@code Data_rifle}.
     */
    @Override
    public void info() {
        System.out.println(ConsoleColors.BLUE + "=============== INFO ARMA ===============" + ConsoleColors.RESET);
        System.out.println(
                "⚔️ Arma:            " + ConsoleColors.RED + this.getClass().getSimpleName() + ConsoleColors.RESET);
        System.out.println("❤️ Nivel requerido: " + ConsoleColors.RED + this.getminNivel() + ConsoleColors.RESET);
        System.out.println("⭐ Dano:            " + ConsoleColors.GREEN + this.getdano() + ConsoleColors.RESET);
    }
}
