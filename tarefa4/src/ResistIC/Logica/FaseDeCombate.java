package ResistIC.Logica;
import ResistIC.Interfaces.Fase;
import ResistIC.Personagens.Monstros.Monstro;
import ResistIC.Personagens.Herois.Heroi;
import ResistIC.Logica.Dificuldade;


public class FaseDeCombate implements Fase {
    private int numero_da_fase;
    private String ambiente;
    private Monstro monstro;
    private TipoCenario Tipo_de_Cenario;
    private Dificuldade dificuldade;
    


    public FaseDeCombate(int numero_da_fase, String ambiente, Monstro monstro, TipoCenario Tipo_de_Cenario,Enum<Dificuldade> dificuldade)
    {
        this.numero_da_fase = numero_da_fase;
        this.ambiente = ambiente;
        this.monstro = monstro;
        this.Tipo_de_Cenario = Tipo_de_Cenario;
        adequarInimigosDificuldade();
    }

    public void iniciar(Heroi heroi)
    {
        this.Tipo_de_Cenario.apresentarInformacoesCenario();
        System.out.println(this.getAmbiente());
        try {
            Thread.sleep(4000);
            heroi.exibirStatus();
        }

        catch (InterruptedException e) {
            e.printStackTrace();
            ;
        }
    }
    
    //Adequa a vida dos monstros em função da dificuldade selecionada pelo usuário
    private void adequarInimigosDificuldade(){ 
        this.monstro.setPontosDeVida(dificuldade.getMultiplicadorVidaMonstro());
    }

    public TipoCenario getTipoDeCenario()
    {
        return Tipo_de_Cenario;
    }

    //public boolean isConcluida() {
    //    boolean esta_concluida = true;
    //    int i = 0;
    //    while(esta_concluida && i < monstros.length)
    //    {
    //        if (monstros[i].estaVivo()) {
    //            return false;
    //        }
    //    }
    //    return true;
    //}


    public int getNivel() 
    {
        return numero_da_fase;
    }
    public String getAmbiente()
    {
        return ambiente;
    }

    public Monstro getMonstro() {
        return monstro;
    }
    
}
