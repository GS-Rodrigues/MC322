package ResistIC.Logica;

import ResistIC.Personagens.Herois.Lehilton;
import ResistIC.Personagens.Herois.Marcelo;
import ResistIC.Personagens.Monstros.Canvaspecter;
import ResistIC.Personagens.Monstros.Chronoloop;
import ResistIC.Personagens.Monstros.Genomex;
import ResistIC.Suporte.ConsoleColors;
import ResistIC.Suporte.Lore;

public class MenuPrincipal {
    public void escolher() {
        boolean rodando = true;
        while (rodando) {
            int instancia = InputManager.lerInteiro("Digite sua Opção> ", 1, 6);
            System.out.println();
            if (instancia == 1) {
                GameManager newgame = new GameManager();
                newgame.iniciar();
            }

            else if (instancia == 2) {
                System.out.println(Lehilton.descricao);
                System.out.println();
                System.out.println(Marcelo.descricao);
            }

            else if (instancia == 3) {
                System.out.println(Canvaspecter.descricao + "\n");
                System.out.println(Chronoloop.descricao + "\n");
                System.out.println(Genomex.descricao + "\n");
            }

            else if (instancia == 4) {
                InputManager.fecharScanner();
                System.out.println("Jogo encerrado. Obrigado por jogar!");
                rodando = false;
            }

            else if (instancia == 5) {
                Lore.imprimir();
            }

            else if (instancia == 6) {
                System.out.println(ConsoleColors.ORANGE + "GUILHERME RODRIGUES DA SILVA: "
                        + ConsoleColors.RESET
                        + "Aluno de Ciência da Computação na Universidade Estadual de Campinas (ingresso em 2024). Github: https://github.com/GS-Rodrigues)");

                System.out.println(ConsoleColors.ORANGE + "GIOVANNI BARBOSA HERRERO: "
                        + ConsoleColors.RESET
                        + "Aluno de Ciência da Computação na Universidade Estadual de Campinas (ingresso em 2024). Github: https://github.com/GiovanniHerrero)");

            }
            System.out.println();
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
        System.out.println(ConsoleColors.ORANGE + "[6]" + ConsoleColors.RESET + " Devs do Game");
        this.escolher();
    };

}
