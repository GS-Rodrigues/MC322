package ResistIC.itens.Armas;

import ResistIC.Suporte.ConsoleColors;

/**
 * Representa a lendária {@code Codeblade}, uma espada forjada a partir de
 * fragmentos
 * de código proibido durante a guerra entre humanos e IAs.
 *
 * <p>
 * Criada nos laboratórios secretos do IC, a {@code Codeblade}
 * foi a primeira arma desenvolvida pela Resistência após a queda dos governos
 * humanos.
 * Forjada em linhas de código puro, ela simboliza o poder do conhecimento
 * humano
 * contra o domínio das máquinas conscientes.
 * </p>
 *
 * <p>
 * Esta arma é concedida aos recrutas iniciantes da Resistência — jovens
 * programadores
 * que se unem à luta pela liberdade. Seu dano base é de {@code 10}, e o nível
 * mínimo
 * exigido para empunhá-la é {@code 1}, representando o início da jornada de um
 * herói.
 * </p>
 *
 * <p>
 * A {@code Codeblade} herda os comportamentos básicos da classe {@link Arma} e
 * sobrescreve o método {@link #info()}.
 * </p>
 *
 * <p>
 * <b>Contexto histórico:</b><br>
 * Após o colapso das civilizações humanas em 2147, o IC tornou-se
 * a última fortaleza da humanidade. Lá, mestres rebeldes ensinaram aos
 * sobreviventes
 * a transformar código em arma — e assim nasceu a Codeblade, símbolo da
 * resistência.
 * </p>
 *
 * @author Guilherme & Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public class Codeblade extends Arma {

    /**
     * Cria uma nova instância da arma {@code Codeblade} com
     * dano fixo de {@code 10} e nível mínimo requerido igual a {@code 1}.
     */
    public Codeblade() {
        super(10, 1);
    }

    /**
     * Exibe no console as informações detalhadas da {@code Codeblade},
     * incluindo nome, nível mínimo requerido e dano.
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
