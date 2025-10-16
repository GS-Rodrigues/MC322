package ResistIC;

import ResistIC.Logica.MenuPrincipal;

/**
 * Ponto de entrada do jogo.
 * <p>
 * Inicializa o menu principal e inicia a interação do jogador com o jogo.
 * </p>
 */
public class Main {

    /**
     * Método principal que é executado ao iniciar o jogo.
     */
    public static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal();
        menu.exibirmenu();
    }
}
