package ResistIC.Logica;

public enum TipoCenario {
    INSTITUTO_GENÉRICO("GENÉRICO", "ATAQUES SEM ESPECIALIDADE"),
    INSTITUTO_DE_EXATAS("EXATAS", "ATAQUES NUMÉRICOS"),
    INSTITUTO_DE_HUMANAS("HUMANAS", "ATAQUES DE PERSUASÃO"),
    INSTITUTO_DE_BIOLOGICAS("BIOLÓGICAS", "ATAQUES ÀS ESTRUTURAS ORGÂNICAS");

    private final String areaDoConhecimento; //Área do conhecimento principal do instituto
    private final String tipoDeAtaque; //Essência do ataque do inimigo do instituto, com base no tipo da área de conhecimento desenvolvida nele

    public void apresentarInformacoesCenario()
    {
        System.out.println("Área do conhecimento do prédio/instituto: " + areaDoConhecimento);
        System.out.println("Especialidade dos inimigos: " + tipoDeAtaque);
    }

    TipoCenario(String areaDoConhecimento, String tipoDeAtaque)
    {
        this.areaDoConhecimento = areaDoConhecimento;
        this.tipoDeAtaque = tipoDeAtaque;
    }


    
}
