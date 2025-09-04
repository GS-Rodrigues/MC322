public abstract class Personagem 
{
    private String nome;
    private int pontosDeVida;
    private int forca;

    public Personagem(String nome, int pontosDeVida, int forca) 
    {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.forca = forca;
    }

    public void receberDano(int dano) 
    {
        pontosDeVida = pontosDeVida - dano;
        //Adicionar uma lógica para indicar que o personagem morreu seu pontos de vida<=0?
        //Gui: Acho que podemos usar um metodo, tipo essr abaixo
    }
    
    public boolean isVivo() 
    {
        return pontosDeVida > 0;
    }
    
    public void exibirStatus() 
    {
        System.out.println(this.getClass());
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + pontosDeVida);
        System.out.println("Força: " + forca);
    }

    // Getters para subclasses conseguirem acessarem
    public String getNome() { return nome; }
    public int getVida() { return pontosDeVida; }
    public int getForca() { return forca; }

    protected abstract void atacar(Personagem alvo);
    
}
