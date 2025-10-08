package ResistIC.Logica;

import ResistIC.Suporte.ConsoleColors;

public enum TipoCenario {
    INSTITUTO_DE_EXATAS("EXATAS", "ATAQUES NUMÉRICOS"),
    INSTITUTO_DE_HUMANAS("HUMANAS", "ATAQUES DE PERSUASÃO"),
    INSTITUTO_DE_BIOLOGICAS("BIOLÓGICAS", "ATAQUES ÀS ESTRUTURAS ORGÂNICAS");

    private final String areaDoConhecimento; //Área do conhecimento principal do instituto
    private final String tipoDeAtaque; //Essência do ataque do inimigo do instituto, com base no tipo da área de conhecimento desenvolvida nele

    public void apresentarInformacoesCenario()
    {
        System.out.println(ConsoleColors.CYAN + "Área do conhecimento do prédio/instituto: " + ConsoleColors.RESET + areaDoConhecimento);
        System.out.println("Especialidade dos inimigos: " + tipoDeAtaque);
        System.out.println();
    }

    TipoCenario(String areaDoConhecimento, String tipoDeAtaque)
    {
        this.areaDoConhecimento = areaDoConhecimento;
        this.tipoDeAtaque = tipoDeAtaque;
    }


    
}
