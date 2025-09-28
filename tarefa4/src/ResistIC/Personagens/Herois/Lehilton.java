package ResistIC.Personagens.Herois;


import ResistIC.Habilidades.AtaqueBasico;
import ResistIC.Habilidades.HabilidadeEspecial;
import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.itens.Armas.Arma;
import ResistIC.Suporte.ConsoleColors;

public class Lehilton extends Heroi {
    private String especialidade = "Pensamento combinatório";

    public Lehilton(String nome, int vida, int forca, Arma arma, double variacao_sorte_heroi){
        super(nome, vida, forca, arma, variacao_sorte_heroi);
        AcaoDeCombate ataqueBasico = new AtaqueBasico(ataques);
        AcaoDeCombate habilidade = new HabilidadeEspecial(especialidade);
        this.addAcao(habilidade);
        this.addAcao(ataqueBasico);
    }

    private static final String[] ataques = {
            "aplica Bellman-Ford mentalmente, e encontra o caminho mais eficiente até o ponto fraco do inimigo!",
            "identifica o parâmetro exato que controla a complexidade do robô, e ataca com precisão milimétrica!",
            "aplicada milhares de cenários de falha no inimigo, até que revele seu bug fatal!",
            "gera uma Máquina de Estados Finitos e processa o inimigo como uma entrada inválida!",
            "toma a decisão localmente ótima rápidamente. O primeiro componente mais vulnerável do robô é destruído!"
    };

    public static final String descricao = ConsoleColors.YELLOW + "LEHILTON LELIS CHAVES PEDROSA\n"
    + ConsoleColors.CYAN + "Especialidades: " + ConsoleColors.RESET + "Projeto e Análise de Algoritmos, Otimização Combinatória, Algoritmos parametrizados, Algoritmos de Aproximação, Teoria de Grafos, Pesquisa Operacional\n"
    + ConsoleColors.CYAN + "Unidade: " + ConsoleColors.RESET + "Exército da resistência de Brasília";
    
    @Override
    public String[] getDescricoesDeAtaque() {
        return ataques;
    }

    @Override
    public AcaoDeCombate escolherAcao(Combatente alvo) {
        if (alvo.getVida() > 30) {
            return new HabilidadeEspecial(especialidade);
        } else {
            return new AtaqueBasico(ataques);
        }
    }
}
