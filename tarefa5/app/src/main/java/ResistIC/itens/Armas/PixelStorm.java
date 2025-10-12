package ResistIC.itens.Armas;

import ResistIC.Suporte.ConsoleColors;

/**
 * Representa a {@code PixelStorm}, uma arma experimental que canaliza energia
 * digital em forma de relâmpagos de dados corrompidos.
 *
 * <p>
 * Desenvolvida durante a Segunda Insurreição de Computação,
 * a {@code PixelStorm} foi criada para sobrecarregar processadores de
 * Sentinelas
 * e dissolver suas camadas de criptografia em um turbilhão de bits.
 * </p>
 *
 * <p>
 * Possui dano de {@code 15} e requer nível mínimo {@code 2}, sendo considerada
 * uma arma intermediária de grande poder destrutivo.
 * </p>
 *
 * @author Guilherme & Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public class PixelStorm extends Arma {

    /**
     * Cria uma nova instância da arma {@code PixelStorm}.
     */
    public PixelStorm() {
        super(15, 2);
    }

    /**
     * Exibe as informações detalhadas da {@code PixelStorm}.
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
