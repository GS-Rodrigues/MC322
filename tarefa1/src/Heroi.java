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
    }
    
    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Nivel: " + nivel);
        System.out.println("Experiencia: " + experiencia);
    
    }
}
