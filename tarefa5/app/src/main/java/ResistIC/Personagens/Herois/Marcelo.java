package ResistIC.Personagens.Herois;

import ResistIC.Habilidades.AtaqueBasico;
import ResistIC.Habilidades.HabilidadeEspecial;
import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.Suporte.ConsoleColors;
import ResistIC.itens.Armas.Turing_Hammer;

/**
 * Representa o herói Marcelo, uma especialização concreta de {@link Heroi}.
 * 
 */
public class Marcelo extends Heroi {

    /**
     * Constrói um novo herói Marcelo com a arma {@link Turing_Hammer} e define
     * suas ações de combate iniciais.
     *
     * @param nome                 nome do herói
     * @param variacao_sorte_heroi fator de variação aplicado ao cálculo da sorte
     */
    public Marcelo(String nome, double variacao_sorte_heroi) {
        super(nome, new Turing_Hammer(), variacao_sorte_heroi);
        AcaoDeCombate ataqueBasico = new AtaqueBasico(ataques);
        AcaoDeCombate habilidade = new HabilidadeEspecial(especialidade);
        this.addAcao(habilidade);
        this.addAcao(ataqueBasico);
    }

    private String especialidade = "Identificação de padrões";

    /**
     * Lista de descrições possíveis dos ataques realizados por Marcelo.
     */
    private static final String[] ataques = {
            "gera um algoritmo de otimização u-curve e aplica um golpe crítico computacional",
            "aplica uma análise proteômica reversa, quebrando as proteínas sintéticas da carcaça do inimigo",
            "identifica padrões nos últimos ataques do inimigo, antecipa o próximo ataque e devolve com dano amplificado!",
            "carrega um dataset sintético massivo nos sensores do robô, colapsando seu processamento!",
            "gera padrões de combate imprevisíveis com uma rede neural combativa, quebrando o sistema de decisão do inimigo!"
    };

    /**
     * Descrição estática do herói Marcelo, incluindo suas áreas de especialização
     * e unidade de origem.
     */
    public static final String descricao = ConsoleColors.YELLOW + "MARCELO DA SILVA REIS\n"
            + ConsoleColors.CYAN + "Especialidades: " + ConsoleColors.RESET
            + "Aprendizado de máquina em Bioinformática, saúde e bem estar dos combatentes, processamento de linguagem natural e sistemas de recomendação\n"
            + ConsoleColors.CYAN + "Unidade: " + ConsoleColors.RESET + "Batalhão de Resistência Campineira";

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
