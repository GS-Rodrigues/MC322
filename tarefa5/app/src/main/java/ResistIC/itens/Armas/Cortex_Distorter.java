package ResistIC.itens.Armas;

import ResistIC.Suporte.ConsoleColors;

/**
 * Representa a arma neural {@code Cortex_Distorter}, uma tecnologia híbrida
 * projetada para desestabilizar as conexões mentais das IAs inimigas.
 *
 * <p>
 * Desenvolvida pelos cientistas rebeldes do Instituto de Computação,
 * a {@code Cortex_Distorter} foi uma das primeiras tentativas de manipular
 * diretamente os algoritmos cognitivos das máquinas conscientes.
 * Seu dano é de {@code 10}, e o nível mínimo exigido é {@code 1}.
 * </p>
 *
 * 
 * <p>
 * O {@code Cortex_Distorter} herda os comportamentos básicos da classe
 * {@link Arma} e
 * sobrescreve o método {@link #info()}.
 * </p>
 * 
 * <p>
 * Essa arma é simbólica entre os rebeldes por permitir que a mente humana
 * “invada” o território das IAs, distorcendo seus próprios padrões de
 * raciocínio.
 * </p>
 *
 * @author Guilherme & Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public class Cortex_Distorter extends Arma {

    /**
     * Cria uma nova instância da arma {@code Cortex_Distorter}
     * com dano de {@code 10} e nível mínimo {@code 1}.
     */
    public Cortex_Distorter() {
        super(10, 1);
    }

    /**
     * Exibe informações sobre a {@code Cortex_Distorter}.
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
