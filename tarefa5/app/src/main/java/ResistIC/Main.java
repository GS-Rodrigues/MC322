package ResistIC;

import ResistIC.Logica.MenuPrincipal;

/**
 * Classe principal do RPG.
 */
public class Main {

    /** Construtor privado para impedir instâncias da classe */
    private Main() {
    }

    /**
     * Método principal que é executado ao iniciar o jogo.
     *
     * @param args argumentos passados pela linha de comando (não utilizados neste
     *             jogo)
     */
    public static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal();
        menu.exibirmenu();
    }
}
