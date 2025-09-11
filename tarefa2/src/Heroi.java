public abstract class Heroi extends Personagem
{    
    private int nivel;
    private int experiencia;
    private int pontos_para_proximo_nivel;

    public Heroi(String nome, int vida, int forca, Arma arma) 
    {
        super(nome, vida, forca, arma);
        this.nivel = 1;
        this.experiencia = 0;
        this.pontos_para_proximo_nivel = 100;
    }

    public void ganharExperiencia(int xpconcedido) {
        this.experiencia += xpconcedido;
        if (experiencia >= pontos_para_proximo_nivel) {
            //O nível do Herói é incrementado em 1 sempre que a experiencia atinge 100
            experiencia = experiencia % pontos_para_proximo_nivel;
            this.subirDeNivel();
        }

    }
    
    private void subirDeNivel() {
        this.nivel+=1;
        this.pontosDeVida += 10;
        this.forca += 10;
        this.pontos_para_proximo_nivel += 100;
    }
    
    @Override
    public void exibirStatus() {
        super.exibirStatus();

        System.out.println( 
            "⭐ Nível: " + ConsoleColors.PURPLE + nivel + ConsoleColors.RESET);
        System.out.println(
            "📊 Experiência: " + ConsoleColors.CYAN + experiencia + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "===============================================" + ConsoleColors.RESET);

    }

    
    protected abstract void usarHabilidadeEspecial(Personagem alvo);
}
