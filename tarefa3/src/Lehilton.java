import java.util.Random;

public class Lehilton extends Heroi {

    public Lehilton(String nome, int vida, int forca, Arma arma) 
    {
        super(nome, vida, forca, arma);
    }

    private String especialidade = "Pensamento combinatório";

    private static final String[] ataques =
    {
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
        return new AtaqueBasico(ataques);
        // verificar a parte da tarefa que eles comentam de IA
    }
    
    Random gerador = new Random();

    @Override
    public void usarHabilidadeEspecial(Personagem alvo)
    {
        this.definir_sorte();
        System.out.printf("Lehilton se concentra, usa sua %s preparando um ataque brutal. Desfere o golpe e: ",especialidade);
        if (this.getSorte() >= 0.75) {
            System.out.println("ACERTA! (DANO CRÍTICO): Ativa uma busca combinatória massiva sobre todas as possíveis configurações " + 
                               "do inimigo, identifica todos os pontos de fraqueza e aplica a solução de dano " +
                               "máximo");
            alvo.receberDano(2*(this.getForca()+ this.getArma().getdano()));
        }
        else {
            System.out.println("ERRA! Não causa dano no inimigo!");}
    }
}
