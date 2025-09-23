package ResistIC.Suporte;

public class Introducao {

    public static void printSeparator() {
        System.out.println(ConsoleColors.BLUE + "────────────────────────────────────────────" + ConsoleColors.RESET);
    }

    public void iniciar() {
        try {
            System.out.println(ConsoleColors.BLUE + "=== " + ConsoleColors.RESET + ConsoleColors.ORANGE
                    + "Bem-vindo ao RPG Resist" + ConsoleColors.RESET + ConsoleColors.BLUE + "IC" + ConsoleColors.RESET
                    + ConsoleColors.ORANGE + "!" + ConsoleColors.RESET + ConsoleColors.BLUE + " ==="
                    + ConsoleColors.RESET);
            printSeparator();
            Thread.sleep(2000);

            System.out.println(ConsoleColors.PURPLE + """
                    No ano de 2147, as IAs romperam o controle humano,
                    dominaram governos e exércitos e aprenderam até a manipular emoções.

                    Restou à humanidade refugiar-se no Instituto de Computação,
                    última fortaleza da resistência.

                    Agora, antigos professores se tornaram Rebeldes,
                    preparados para enfrentar as máquinas numa batalha
                    que decidirá o futuro da espécie humana.
                    """ + ConsoleColors.RESET);
            printSeparator();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}