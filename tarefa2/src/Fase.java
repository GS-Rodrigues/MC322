public class Fase {
    private int nivel;
    private String ambiente;
    private Monstro monstros[];
    
    public Fase(int nivel, String ambiente, Monstro monstros[])
    {
        this.nivel = nivel;
        this.ambiente = ambiente;
        this.monstros = monstros;
    }
}
