package ResistIC.itens.Armas;

import javax.xml.bind.annotation.XmlRootElement;

import ResistIC.Suporte.ConsoleColors;

/**
 * Representa o lendário {@code Turing_Hammer}, uma arma simbólica da
 * Resistência,
 * inspirada no legado do pai da comp, Alan Turing.
 *
 * <p>
 * Forjado com ligas de silício e memória computacional comprimida,
 * o {@code Turing_Hammer} é mais do que uma arma — é um manifesto.
 * Ele representa o impacto humano sobre as máquinas e a esperança
 * de que a lógica pode ser usada tanto para destruir quanto para libertar.
 * </p>
 *
 * <p>
 * Possui dano de {@code 10} e nível mínimo {@code 1}, sendo amplamente
 * utilizado
 * pelos combatentes iniciantes como símbolo de sabedoria e força racional.
 * </p>
 *
 * <p>
 * <b>Registro da Resistência #042:</b><br>
 * “Com cada golpe, lembramos que fomos nós quem as ensinamos a pensar —
 * e seremos nós quem as ensinaremos a temer.”
 * </p>
 *
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-08
 */
@XmlRootElement
public class Turing_Hammer extends Arma {

    /**
     * Cria uma nova instância da arma {@code Turing_Hammer}.
     */
    public Turing_Hammer() {
        super(10, 1);
    }

    /**
     * Exibe as informações detalhadas do {@code Turing_Hammer}.
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
