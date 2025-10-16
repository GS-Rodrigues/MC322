package ResistIC.Personagens.Herois;

import ResistIC.Habilidades.AtaqueBasico;
import ResistIC.Habilidades.HabilidadeEspecial;
import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.itens.Armas.Codeblade;
import ResistIC.Suporte.ConsoleColors;

/**
 * Representa o herói Lehilton, uma especialização concreta de {@link Heroi}.
 * 
 */
public class Lehilton extends Heroi {
    private String especialidade = "Pensamento combinatório";

    /**
     * Constrói um novo herói Lehilton com a arma {@link Codeblade} e define
     * suas ações de combate iniciais.
     *
     * @param nome                 nome do herói
     * @param variacao_sorte_heroi fator de variação aplicado ao cálculo da sorte
     */
    public Lehilton(String nome, double variacao_sorte_heroi) {
        super(nome, new Codeblade(), variacao_sorte_heroi);
        AcaoDeCombate ataqueBasico = new AtaqueBasico(ataques);
        AcaoDeCombate habilidade = new HabilidadeEspecial(especialidade);
        this.addAcao(habilidade);
        this.addAcao(ataqueBasico);
    }

    /**
     * Lista de descrições possíveis dos ataques realizados por Lehilton.
     */
    private static final String[] ataques = {
            "aplica Bellman-Ford mentalmente, e encontra o caminho mais eficiente até o ponto fraco do inimigo!",
            "identifica o parâmetro exato que controla a complexidade do robô, e ataca com precisão milimétrica!",
            "aplicada milhares de cenários de falha no inimigo, até que revele seu bug fatal!",
            "gera uma Máquina de Estados Finitos e processa o inimigo como uma entrada inválida!",
            "toma a decisão localmente ótima rápidamente. O primeiro componente mais vulnerável do robô é destruído!"
    };

    /**
     * Descrição estática do herói Lehilton, incluindo suas áreas de especialização
     * e unidade de origem.
     */
    public static final String descricao = ConsoleColors.YELLOW + "LEHILTON LELIS CHAVES PEDROSA\n"
            + ConsoleColors.CYAN + "Especialidades: " + ConsoleColors.RESET
            + "Projeto e Análise de Algoritmos, Otimização Combinatória, Algoritmos parametrizados, Algoritmos de Aproximação, Teoria de Grafos, Pesquisa Operacional\n"
            + ConsoleColors.CYAN + "Unidade: " + ConsoleColors.RESET + "Exército da Resistência de Brasília";

    /**
     * Retorna as descrições dos ataques disponíveis para o herói.
     *
     * @return vetor de descrições de ataque
     */
    @Override
    public String[] getDescricoesDeAtaque() {
        return ataques;
    }

    /**
     * Escolhe automaticamente a ação de combate a ser executada,
     * com base na vida atual do alvo.
     * <li>Se a vida do alvo for maior que 30, utiliza
     * {@code HabilidadeEspecial}.</li>
     * <li>Se a vida for menor ou igual a 30, utiliza {@code AtaqueBasico}.</li>
     *
     * @param alvo inimigo ou combatente alvo
     * @return ação de combate selecionada
     */
    @Override
    public AcaoDeCombate escolherAcao(Combatente alvo) {
        if (alvo.getVida() > 30) {
            return new HabilidadeEspecial(especialidade);
        } else {
            return new AtaqueBasico(ataques);
        }
    }
}
