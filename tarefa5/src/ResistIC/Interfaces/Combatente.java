package ResistIC.Interfaces;
import ResistIC.itens.Armas.Arma;

public interface Combatente 
{
    String getNome();
    boolean estaVivo();
    void receberDano(int dano);
    void receberCura(int cura);
    AcaoDeCombate escolherAcao(Combatente alvo);
    public int getVida();
    public int getForca();
    public Arma getArma();
    String[] getDescricoesDeAtaque();

}