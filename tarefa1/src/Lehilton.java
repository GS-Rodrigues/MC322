public class Lehilton extends Heroi {

    private String especialidade;

    private static final String[] ataques =
    {
    "Lehilton aplica Bellman-Ford mentalmente, e encontra o caminho mais eficiente até o ponto fraco do inimigo!",
    "O professor identifica o parâmetro exato que contra a complexidade do robô, e ataca com precisão milimétrica!",
    "Lehilton aplicada milhares de cenários de falha no inimigo, até que revele seu bug fatal!",
    "Lehilton gera uma Máquina de Estados Finitos e processa o inimigo como uma entrada inválida!",
    "O professor toma a decisão localmente ótima rápidamente. O primeiro componente mais vulnerável do robô é destruído!"
            };
    
    public Lehilton(String nome, int vida, int ataque) 
    {
        super(nome, vida, ataque);
        especialidade = "Pensamento combinatório";
    }
}
