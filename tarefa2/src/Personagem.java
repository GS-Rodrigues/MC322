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
        if (!isVivo()) {
            System.out.println(nome+ "foi DERROTADO!");
        }

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

    public abstract void atacar(Personagem alvo);
    
}
