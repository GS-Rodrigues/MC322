public abstract class Monstro extends Personagem {
    public Monstro(String nome, int pontosDeVida, int forca) {
        super(nome, pontosDeVida, forca);
    }

    public int xpConcedido;

    @override
    public void exibirStatus();

    }
}
