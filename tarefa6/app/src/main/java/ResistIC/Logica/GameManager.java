package ResistIC.Logica;


/**
 * Responsável por adquirir as informações para criar um novo jogo
 *
 * A classe {@code GameManager} é responsável por:
 *
 * <ul>
 * <li>Solicitar informações do jogador (nome, herói e
 * dificuldade).</li>
 * <li>Gerar as fases de combate através de
 * {@link ConstrutorDeCenarioFixo}.</li>
 * </ul>
 *
 * <p>
 * O método {@link #criarjogo()} inicia o código para criação de novo jogo
 * </p>
 *
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-12
 */
public class GameManager{

    /** Construtor sem argumentos */
    protected GameManager () {
    }

    /**
     * Solicita informações para criar novo jogo.
     *
     * <p>
     * Solicita nome do jogador, escolha do herói e dificuldade, gera as fases
     * </p>
     */
    public void criarjogo() {
        
            //Solicita a quantidade de fases
            int quantidade_de_fases = InputManager.lerInteiro("Quantas fases quer jogar? (1,2 ou 3) -->", 1, 3);
            System.out.println();

            //Solicita a dificuldade de jogo
            int dificuldade = InputManager
                    .lerInteiro("Selecione a dificuldade. Digite \n1: FÁCIL\n2: NORMAL\n3: DIFÍCIL\nE dê ENTER -->", 1,
                            3);

            
            //Solicita o nome do jogador
            String nome_do_jogador;
            do {
                nome_do_jogador = InputManager.lerString("Digite o nome do seu personagem: ");
                if (nome_do_jogador == "") {
                    System.out.println(
                            "O nome não pode ser vazio! Você deve escolher um nome válido para seu personagem!");
                }
            } while (nome_do_jogador == "");

            //Solicita o nome do herói que o jogador deseja escolher
            String string_heroi;
            do {
                string_heroi = InputManager.lerString("Qual herói você deseja escolher? (Lehilton/Marcelo) -->").trim();

                if (!string_heroi.equalsIgnoreCase("Lehilton") && !string_heroi.equalsIgnoreCase("Marcelo")) {
                    System.out.println("Você deve escolher somente Lehilton ou Marcelo.");
                }
            } while (!string_heroi.equalsIgnoreCase("Lehilton") && !string_heroi.equalsIgnoreCase("Marcelo"));



            //Placeholder: cria um objeto BATALHA passando os atributos acima como parâmetro e e chamar o método batalha.executar
            Batalha batalha = new Batalha(quantidade_de_fases, dificuldade, nome_do_jogador, string_heroi);
            batalha.executar();


    }

}
