package ResistIC.Personagens.Herois;

import java.util.List;

import ResistIC.Habilidades.AtaqueBasico;
import ResistIC.Habilidades.HabilidadeEspecial;
import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.itens.Armas.Arma;

public class Lehilton extends Heroi {
    private String especialidade = "Pensamento combinatório";

    public Lehilton(String nome, int vida, int forca, Arma arma, List<AcaoDeCombate> acoes) {
        super(nome, vida, forca, arma);
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
