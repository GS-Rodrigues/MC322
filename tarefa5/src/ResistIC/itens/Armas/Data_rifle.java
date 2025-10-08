package ResistIC.itens.Armas;
import ResistIC.Suporte.ConsoleColors;

public class Data_rifle extends Arma 
{

    public Data_rifle(int dano, int minNivel) 
    {
        super(dano, minNivel);

    }

    public void info()
    {
        System.out.println(ConsoleColors.BLUE + "=============== INFO ARMA ===============" + ConsoleColors.RESET);
        System.out.println("⚔️ Arma:            " + ConsoleColors.RED + this.getClass().getSimpleName() + ConsoleColors.RESET);
        System.out.println("❤️ Nivel requerido: " + ConsoleColors.RED + this.getminNivel() + ConsoleColors.RESET);
        System.out.println("⭐ Dano:            " + ConsoleColors.GREEN + this.getdano() + ConsoleColors.RESET);
    }

}
