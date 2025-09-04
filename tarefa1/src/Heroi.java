public abstract class Heroi extends Personagem
{

    private int nivel;
    private int experiencia;

    public Heroi(String nome, int vida, int forca) 
    {
        super(nome, vida, forca);
        this.nivel = 1;
        this.experiencia = 0;
    }

    public void ganharExperiencia(int xpconcedido) {
        this.experiencia += xpconcedido;
        if (experiencia >= 100) {
            //O nível do Herói é incrementado em 1 sempre que a experiencia atinge 100
            experiencia %= experiencia;
            nivel += 1 + experiencia;
            
        }
        
    }
    
    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Nivel: " + nivel);
        System.out.println("Experiencia: " + experiencia);

    }
    
    public abstract void usarHabilidadeEspecial(Personagem alvo);
}
