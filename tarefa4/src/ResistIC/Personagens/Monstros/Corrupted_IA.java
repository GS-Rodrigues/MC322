package ResistIC.Personagens.Monstros;

import java.util.Random;

import ResistIC.Habilidades.AtaqueBasico;
import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.Interfaces.Item;
import ResistIC.itens.Armas.PixelStorm;
import ResistIC.itens.Armas.Turing_Hammer;

public class Corrupted_IA extends Monstro {
    public Corrupted_IA() {
        super("Corrupted_IA", 150, 30, 150, new PixelStorm());
    }

    private static final String[] ataques = {
            "lança um ataque de código corrompido!",
            "sobrecarrega o sistema com loops infinitos!",
            "injeta vírus digitais devastadores!",
            "distorce a realidade virtual e causa instabilidade!",
            "emite uma onda de dados corrompidos que frita circuitos!"
    };

    Random gerador = new Random();

    @Override
    public String[] getDescricoesDeAtaque() {
        return ataques;
    }

    @Override
    public AcaoDeCombate escolherAcao(Combatente alvo) {
        return new AtaqueBasico(ataques);
    }

    public Item droparLoot() {
        Item item = new Turing_Hammer(this.forca, forca / 20);
        return item;
    }
}
