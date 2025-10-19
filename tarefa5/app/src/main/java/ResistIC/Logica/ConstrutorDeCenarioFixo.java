package ResistIC.Logica;

import java.util.ArrayList;

import ResistIC.Interfaces.GeradorDeFases;
import ResistIC.Personagens.Monstros.Chronoloop;
import ResistIC.Personagens.Monstros.Canvaspecter;
import ResistIC.Personagens.Monstros.Monstro;
import ResistIC.Personagens.Monstros.Genomex;
import ResistIC.Suporte.ConsoleColors;

/**
 * Constrói cenários fixos para as fases do jogo, preparando os ambientes e
 * os monstros que o jogador enfrentará.
 *
 * <p>
 * A classe {@code ConstrutorDeCenarioFixo} implementa a interface
 * {@link GeradorDeFases} e é responsável por criar fases pré-definidas
 * com base nos institutos do campus e nos inimigos correspondentes.
 * </p>
 *
 * Cada fase possui:
 * <ul>
 * <li>Um nome e uma descrição imersiva, detalhando o cenário e os perigos.</li>
 * <li>Um {@link TipoCenario} específico que representa o local.</li>
 * <li>Um monstro designado, que simboliza os desafios que a Resistência
 * deve enfrentar.</li>
 * </ul>
 *
 * Exemplo de fases criadas:
 * <ul>
 * <li><b>Instituto de Biologia:</b> Vegetação densa e experimentos fora de
 * controle.</li>
 * <li><b>Instituto de Artes:</b> Corredores hipnotizantes e ilusões
 * perigosas.</li>
 * <li><b>Instituto de Física Gleb Wataghin:</b> Atmosfera sombria, manchas de
 * sangue e desafios extremos.</li>
 * </ul>
 *
 *
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-12
 */
public class ConstrutorDeCenarioFixo implements GeradorDeFases {
        /** Construtor sem argumentos */
        protected ConstrutorDeCenarioFixo() {
        }

        /** Nomes e descrições detalhadas de cada fase do campus. */
        private static final String[] nomeFases = {
                        ConsoleColors.GREEN
                                        + "Instituto de Biologia: Uma grande vegetação cobre o imponente prédio, onde pesquisas com perigosos seres biológicos fugiram do controle... O que pode se espreitar por essas bandas? "
                                        + ConsoleColors.RESET,
                        ConsoleColors.PURPLE
                                        + "Instituto de Artes: bonitas harmonias ecoam pelos corredores, capazes de hipnotizar o mais firme dos combatentes"
                                        + ConsoleColors.RESET,
                        ConsoleColors.YELLOW
                                        + "Instituto de Física Gleb Wataghin - o temido: Uma grande nuvem escura paira sobre o prédio, similar a um hospício. Manchas de sangue tingem o chão de vermelho. Que loucuras se passam ali?"
                                        + ConsoleColors.RESET
        };

        /** Tipos de cenário correspondentes a cada fase. */
        private static final TipoCenario[] tipos_de_cenario = {
                        TipoCenario.INSTITUTO_DE_BIOLOGICAS,
                        TipoCenario.INSTITUTO_DE_HUMANAS,
                        TipoCenario.INSTITUTO_DE_EXATAS
        };

        /** Monstros específicos designados para cada fase. */
        private static final Monstro[] monstros = { new Genomex(), new Chronoloop(), new Canvaspecter() };

        /**
         * Gera uma lista de {@link FaseDeCombate} com as fases pré-definidas.
         *
         * <p>
         * Para cada fase, define o índice, nome/descritivo, monstro, tipo de cenário
         * e a dificuldade desejada. Retorna todas as fases em ordem sequencial.
         * </p>
         *
         * @param nFases      o número de fases a serem geradas.
         * @param Dificuldade a dificuldade atribuída a cada fase.
         * @return uma {@link ArrayList} contendo todas as {@code FaseDeCombate}
         *         geradas.
         */
        @Override
        public ArrayList<FaseDeCombate> gerar(int nFases, Dificuldade Dificuldade) {
                ArrayList<FaseDeCombate> fases = new ArrayList<>();
                for (int i = 0; i < nFases; i++) {
                        fases.add(new FaseDeCombate(i, nomeFases[i], monstros[i], tipos_de_cenario[i], Dificuldade));
                }
                return fases;
        };
}
