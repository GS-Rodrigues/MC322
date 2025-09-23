package ResistIC.Logica;
import ResistIC.Interfaces.Fase;
import ResistIC.Personagens.Monstros.Monstro;
import ResistIC.Personagens.Herois.Heroi;;

public class FaseDeCombate implements Fase {
    private int nivel;
    private String ambiente;
    private Monstro monstros[];
    private TipoCenario Tipo_de_Cenario;
    


    public FaseDeCombate(int nivel, String ambiente, Monstro monstros[], TipoCenario Tipo_de_Cenario)
    {
        this.nivel = nivel;
        this.ambiente = ambiente;
        this.monstros = monstros;
        this.Tipo_de_Cenario = Tipo_de_Cenario;
    }

    public void iniciar(Heroi heroi)
    {
            this.Tipo_de_Cenario.apresentarInformacoesCenario();
            System.out.println(this.getAmbiente());
        try
        {
            Thread.sleep(4000);
            heroi.exibirStatus();
        }

        catch(InterruptedException e)
        {
            e.printStackTrace();
            ;
        }
    }

    public TipoCenario getTipoDeCenario()
    {
        return Tipo_de_Cenario;
    }

    public boolean isConcluida() {
        boolean esta_concluida = true;
        int i = 0;
        while(esta_concluida && i < monstros.length)
        {
            if (monstros[i].estaVivo()) {
                return false;
            }
        }
        return true;
    }


    public int getNivel() 
    {
        return nivel;
    }
    public String getAmbiente()
    {
        return ambiente;
    }

    public Monstro[] getMonstros() {
        return monstros;
    }
    
}
