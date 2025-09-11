public abstract class Personagem 
{
    protected String nome;
    protected int pontosDeVida;
    protected int forca;
    protected Arma arma;

    public Personagem(String nome, int pontosDeVida, int forca, Arma arma) 
    {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.forca = forca;
        this.arma = arma;
    }

    public void receberDano(int dano) 
    {
        pontosDeVida = pontosDeVida - dano;
    }
    
    public boolean isVivo() 
    {
        return pontosDeVida > 0;
    }
    
    public void exibirStatus() {
        String classe = this.getClass().getSimpleName(); // pega só "Lehilton", não "class Lehilton"

        System.out.println(ConsoleColors.BLUE + "=============== STATUS PERSONAGEM ===============" + ConsoleColors.RESET);
        System.out.println("👤 Classe: " + ConsoleColors.ORANGE + classe + ConsoleColors.RESET);
        System.out.println("📛 Nome:   " + ConsoleColors.CYAN + nome + ConsoleColors.RESET);
        System.out.println("❤️ Vida:   " + ConsoleColors.RED + pontosDeVida + ConsoleColors.RESET);
        System.out.println("⚔️ Força:  " + ConsoleColors.GREEN + forca + ConsoleColors.RESET);
    }


    // Getters para subclasses conseguirem acessarem
    public String getNome() { return nome; }
    public int getVida() { return pontosDeVida; }
    public int getForca() { return forca; }
    public Arma getArma() { return arma; }

    public abstract void atacar(Personagem alvo);
    
}
