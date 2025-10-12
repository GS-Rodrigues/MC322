package ResistIC.itens.Armas;
import ResistIC.Suporte.ConsoleColors;

/**
 * Representa a poderosa {@code Quanta_Cutter}, uma lâmina de energia quântica
 * utilizada para fatiar as estruturas de dados das IAs com precisão atômica.
 *
 * <p>
 * Forjada nas profundezas do Campus Subterrâneo, a {@code Quanta_Cutter}
 * foi projetada pelos antigos professores de Física Computacional,
 * combinando ciência quântica e engenharia reversa de algoritmos.
 * </p>
 *
 * <p>
 * Seu dano é de {@code 20} e o nível mínimo necessário é {@code 3}, sendo
 * uma das armas mais letais da Resistência.
 * </p>
 *
 * <p><b>Citação da Resistência:</b><br>
 * “Ela corta não apenas o metal — mas também a própria lógica das máquinas.” 
 * </p>
 *
 * @author Guilherme & Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public class Quanta_Cutter extends Arma {

    /**
     * Cria uma nova instância da arma {@code Quanta_Cutter}.
     */
    public Quanta_Cutter() {
        super(20, 3);
    }

    /**
     * Exibe informações detalhadas sobre a {@code Quanta_Cutter}.
     */
    @Override
    public void info() {
        System.out.println(ConsoleColors.BLUE + "=============== INFO ARMA ===============" + ConsoleColors.RESET);
        System.out.println("⚔️ Arma:            " + ConsoleColors.RED + this.getClass().getSimpleName() + ConsoleColors.RESET);
        System.out.println("❤️ Nivel requerido: " + ConsoleColors.RED + this.getminNivel() + ConsoleColors.RESET);
        System.out.println("⭐ Dano:            " + ConsoleColors.GREEN + this.getdano() + ConsoleColors.RESET);
    }
}
