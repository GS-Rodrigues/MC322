package ResistIC.Logica;

public enum Dificuldade {
    FACIL(0.75, 0.2),
    NORMAL(1.0, 0.0),
    DIFICL(1.5, -0.2);

    private final double multiplicador_vida_monstro; //Fator de aumento/redução da vida do monstro
    private final double variacao_sorte_heroi; //variação na sorte do heroi

    public double getMultiplicadorVidamonstro()
    {
        return multiplicador_vida_monstro;
    }

    public double getVariacaoSorteHeroi()
    {
        return variacao_sorte_heroi;
    }

    Dificuldade(double multiplicador_vida_monstro, double variacao_sorte_heroi)
    {
        this.multiplicador_vida_monstro = multiplicador_vida_monstro;
        this.variacao_sorte_heroi = variacao_sorte_heroi;
    }


    
}
