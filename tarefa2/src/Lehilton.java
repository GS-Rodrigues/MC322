import java.util.Random;

public class Lehilton extends Heroi {

    private String especialidade = "Pensamento combinatório";

    private static final String[] ataques =
    {
    "aplica Bellman-Ford mentalmente, e encontra o caminho mais eficiente até o ponto fraco do inimigo!",
    "identifica o parâmetro exato que controla a complexidade do robô, e ataca com precisão milimétrica!",
    "aplicada milhares de cenários de falha no inimigo, até que revele seu bug fatal!",
    "gera uma Máquina de Estados Finitos e processa o inimigo como uma entrada inválida!",
    "toma a decisão localmente ótima rápidamente. O primeiro componente mais vulnerável do robô é destruído!"
    };
    
    Random gerador = new Random();

    public Lehilton(String nome, int vida, int forca, Arma arma) 
    {
        super(nome, vida, forca, arma);
    }

    @Override
    public void atacar(Personagem alvo) 
    {
        String ataque = ataques[gerador.nextInt(ataques.length)];
        alvo.receberDano(this.getForca());
        System.out.printf("%-20s -> %-40s (dano: %d) | Vida do inimigo: %d\n", this.getNome(), ataque, this.getForca(), alvo.getVida());

    };

    @Override
    public void usarHabilidadeEspecial(Personagem alvo)
    {
        String habilidadeEspecial ="""
                Ativa uma busca combinatória massiva sobre todas as possíveis configurações
                do inimigo, identifica todos os pontos de fraqueza e aplica a solução de dano
                máximo
                """;
                
        System.out.println(this.getNome() + " usa sua especialidade: " + especialidade + "." + habilidadeEspecial);
        alvo.receberDano(this.getForca());
        alvo.receberDano(this.getForca());


    }
}
