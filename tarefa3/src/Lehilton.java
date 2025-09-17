public class Lehilton extends Heroi {

    public Lehilton(String nome, int vida, int forca, Arma arma) {
        super(nome, vida, forca, arma);
    }

    private String especialidade = "Pensamento combinatório";

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
        System.out.println("Chegou Aqui");

        if (alvo.getVida() > 30) {
            
            return new HabilidadeEspecial(especialidade);
        } else {
            return new AtaqueBasico(ataques);
        }
    }
}
