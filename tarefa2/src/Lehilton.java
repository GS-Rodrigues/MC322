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
        alvo.receberDano(this.getForca() + this.getArma().getdano());
        System.out.printf("%-20s -> %-40s (dano: %d) | Vida do inimigo: %d\n", this.getNome(), ataque, this.getForca(), alvo.getVida());
        if (!alvo.isVivo()) {
            System.out.printf("%s FOI DERROTADO\n", alvo.getNome());
        }

    };

    @Override
    public void usarHabilidadeEspecial(Personagem alvo)
    {
        sorte = 
        System.out.println("Lehilton se concentra, preparando um ataque brutal. Desfere o golpe e: ");
        if(sorte>75%):
        String habilidadeEspecial ="""
                Ativa uma busca combinatória massiva sobre todas as possíveis configurações
                do inimigo, identifica todos os pontos de fraqueza e aplica a solução de dano
                máximo
                """;
                
        System.out.println(this.getNome() + " usa sua especialidade: " + especialidade + "." + habilidadeEspecial);
        alvo.receberDano(this.getForca()+ this.getArma().getdano());
        alvo.receberDano(this.getForca()+ this.getArma().getdano());


    }
}
