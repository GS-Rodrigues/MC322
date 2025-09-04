public class Heroi extends Personagem
{

    private int nivel;
    private int experiencia;

    public Heroi(String nome, int vida, int ataque) 
    {
        super(nome, vida, ataque);
        this.nivel = 1;
        this.experiencia = 0;
    }

    public void atacar(Personagem inimigo) 
    {
    }

    public void ganharExperiencia(int xpconcedido) {
        this.experiencia += xpconcedido;
    }
    
}
