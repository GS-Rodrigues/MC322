public abstract class Arma 
{
    private int dano;
    private int minNivel;

    public Arma(int dano, int minNivel) 
    {
        this.dano = dano;
        this.minNivel = minNivel;
    }

    public abstract void info();


    // Getters para subclasses conseguirem acessarem
    public int getdano() 
    { 
        return dano; 
    }
    public int getminNivel() 
    { 
        return minNivel; 
    }
    
}
