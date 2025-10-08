package ResistIC.itens.Armas;
import ResistIC.Suporte.ConsoleColors;

public class Cortex_Distorter extends Arma {

    public Cortex_Distorter() {
        super(10, 1);
    }

    public void info() {
        System.out.println(ConsoleColors.BLUE + "=============== INFO ARMA ===============" + ConsoleColors.RESET);
        System.out.println(
                "⚔️ Arma:            " + ConsoleColors.RED + this.getClass().getSimpleName() + ConsoleColors.RESET);
        System.out.println("❤️ Nivel requerido: " + ConsoleColors.RED + this.getminNivel() + ConsoleColors.RESET);
        System.out.println("⭐ Dano:            " + ConsoleColors.GREEN + this.getdano() + ConsoleColors.RESET);
    }

}
