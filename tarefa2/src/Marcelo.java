import java.util.Random;

public class Marcelo extends Heroi {

    private String especialidade = "Identificação de padrões";

    private static final String[] ataques =
    {
    "gera um algoritmo de otimização u-curve e aplica um golpe crítico computacional",
    "aplica uma análise proteômica reversa, quebrando as proteínas sintéticas da carcaça do inimigo",
    "identifica padrões nos últimos ataques do inimigo, antecipa o próximo ataque e devolve com dano amplificado!",
    "carrega um dataset sintético massivo nos sensores do robô, colapsando seu processamento!",
    "gera padrões de combate imprevisíveis com uma rede neural combativa, quebrando o sistema de decisão do inimigo!"

    };
    
    Random gerador = new Random();

    public Marcelo(String nome, int vida, int forca, Arma arma) 
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
    protected void usarHabilidadeEspecial(Personagem alvo)
    {
        String habilidadeEspecial = 
        """
        Inicia uma sequência de execução paralela em múltiplas GPUs cognitivas,
        fundindo todas as suas redes neurais, algoritmos genéticos e árvores de decisão em um vírus
        injetado no inimigo!. O resultado: uma Singularidade Algorítmica —
        um colapso computacional que distorce a lógica da IA inimiga ao ponto da autodestruição.
        """;
        
        System.out.println(this.getNome() + " usa sua especialidade: " + especialidade + "." + habilidadeEspecial);
        alvo.receberDano(this.getForca());
        alvo.receberDano(this.getForca());


    }
}
