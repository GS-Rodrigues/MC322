package ResistIC.Logica;

import ResistIC.Personagens.Herois.Lehilton;
import ResistIC.Personagens.Herois.Marcelo;
import ResistIC.Personagens.Monstros.Canvaspecter;
import ResistIC.Personagens.Monstros.Chronoloop;
import ResistIC.Personagens.Monstros.Genomex;
import ResistIC.Suporte.ConsoleColors;
import ResistIC.Suporte.Lore;

/**
 * Exibe e gerencia o menu principal do jogo.
 *
 * <p>
 * A classe {@code MenuPrincipal} é responsável por apresentar as opções
 * iniciais
 * ao jogador e redirecionar para as funcionalidades correspondentes,
 * como iniciar um novo jogo, visualizar heróis, monstros, lore ou encerrar a
 * aplicação.
 * </p>
 *
 * <p>
 * O método {@link #exibirmenu()} imprime o menu na tela e chama
 * {@link #escolher()}
 * para capturar e processar as ações do jogador.
 * </p>
 *
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-12
 */
public class MenuPrincipal {

    /** Construtor sem argumentos */
    public MenuPrincipal() {
    }

    /**
     * Controla a execução das opções escolhidas pelo jogador.
     *
     * Cada número digitado corresponde a uma ação específica:
     * <ul>
     * <li>1 – Inicia o jogo com {@link GameManager}</li>
     * <li>2 – Exibe descrições dos heróis {@link Lehilton} e {@link Marcelo}</li>
     * <li>3 – Mostra informações sobre os monstros disponíveis</li>
     * <li>4 – Encerra o jogo e fecha o {@link InputManager}</li>
     * <li>5 – Exibe a lore do jogo através de {@link Lore}</li>
     * <li>6 – Mostra informações dos desenvolvedores</li>
     * </ul>
     *
     * O método continua em loop até que o jogador escolha sair.
     */
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

    /**
     * Exibe o menu principal e inicia a captura de opções do jogador.
     *
     * Apresenta as seguintes opções:
     * <ul>
     * <li>[1] Iniciar novo jogo</li>
     * <li>[2] Ver informações dos heróis</li>
     * <li>[3] Ver informações dos monstros</li>
     * <li>[4] Sair do jogo</li>
     * <li>[5] Ver lore do jogo</li>
     * <li>[6] Ver informações dos desenvolvedores</li>
     * </ul>
     */
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
