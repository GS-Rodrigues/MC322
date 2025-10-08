package ResistIC.itens.Armas;

import ResistIC.Interfaces.Item;

public abstract class Arma implements Item {
    private int dano;
    private int minNivel;
    private String nome;

    public Arma(int dano, int minNivel) {
        this.dano = dano;
        this.minNivel = minNivel;
        this.nome = this.getClass().getSimpleName();
    }

    public abstract void info();

    // Getters para subclasses conseguirem acessarem
    public int getdano() {
        return dano;
    }

    public int getminNivel() {
        return minNivel;
    }

    public String getNome() {
        return this.nome;
    }

}
