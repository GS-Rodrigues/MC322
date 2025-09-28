package ResistIC.Logica;

import ResistIC.Suporte.ConsoleColors;
import ResistIC.Suporte.Lore;

public class MenuPrincipal {
    public void escolher() {
        int instancia = InputManager.lerInteiro("Digite sua Opção> ", 1, 6);
        if (instancia == 1) {
            GameManager newgame = new GameManager();
            newgame.iniciar();
        } else if (instancia == 2) {
            System.out.println(ConsoleColors.ORANGE + "Desculpe, ainda estamos desenvolvendo essa funcionalidade!");

        } else if (instancia == 3) {
            System.out.println(ConsoleColors.ORANGE + "Desculpe, ainda estamos desenvolvendo essa funcionalidade!");

        } else if (instancia == 4) {
            System.out.println(ConsoleColors.ORANGE + "Desculpe, ainda estamos desenvolvendo essa funcionalidade!");
        } else if (instancia == 5) {
            Lore.imprimir();
        }
    }

    public void exibirmenu() {
        System.out
                .println(ConsoleColors.BLUE + "=============== " + ConsoleColors.RESET + ConsoleColors.ORANGE + "Resist"
                        + ConsoleColors.RESET + ConsoleColors.BLUE + "IC" + ConsoleColors.RESET + ConsoleColors.ORANGE
                        + "!" + ConsoleColors.RESET + ConsoleColors.BLUE + " ===============" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.ORANGE + "[1]" + ConsoleColors.RESET + " Iniciar Novo Jogo");
        System.out.println(ConsoleColors.ORANGE + "[2]" + ConsoleColors.RESET + " Ver Informações dos Herois");
        System.out.println(ConsoleColors.ORANGE + "[3]" + ConsoleColors.RESET + " Ver Informações dos Monstros");
        System.out.println(ConsoleColors.ORANGE + "[4]" + ConsoleColors.RESET + " Sair do Jogo");
        System.out.println(ConsoleColors.ORANGE + "[5]" + ConsoleColors.RESET + " Ver Lore do Jogo");
        System.out.println();
        System.out.println(ConsoleColors.ORANGE + "[6]" + ConsoleColors.RESET + " Devs do Game");
        this.escolher();
    };

}
