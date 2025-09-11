public abstract class Heroi extends Personagem
{    
    private int nivel;
    private int experiencia;

    public Heroi(String nome, int vida, int forca, Arma arma) 
    {
        super(nome, vida, forca, arma);
        this.nivel = 1;
        this.experiencia = 0;
    }

    public void ganharExperiencia(int xpconcedido) {
        this.experiencia += xpconcedido;
        if (experiencia >= 100) {
            //O nível do Herói é incrementado em 1 sempre que a experiencia atinge 100
            experiencia = experiencia % 100;
            nivel += 1;

        }
        
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
