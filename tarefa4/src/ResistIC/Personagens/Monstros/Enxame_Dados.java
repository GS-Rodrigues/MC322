package ResistIC.Personagens.Monstros;

import java.util.Random;

import ResistIC.Habilidades.AtaqueBasico;
import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.Interfaces.Item;
import ResistIC.itens.Armas.Codeblade;
import ResistIC.itens.Armas.Quanta_Cutter;

public class Enxame_Dados extends Monstro {
    private static final String[] ataques = {
            "invade o sistema, corrompendo suas defesas!",
            "lança milhares de pacotes binários como insetos digitais contra você!",
            "te envolve em uma nuvem caótica de informação letal!",
            "lança fragmentos de código em fúria em você sem piedade!",
            "sobrecarrega seus circuitos com loops infinitos!",
            "lança uma tempestade de bits envenenados que drenam sua energia vital!"
    };

    Random gerador = new Random();

    public Enxame_Dados() {
        super("Enxame de Dados", 200, 40, 200,new Quanta_Cutter());
    }

    public Item droparLoot() {
        Item item = new Codeblade(this.forca, forca / 20);
        return item;
    }

    @Override
    public String[] getDescricoesDeAtaque() {
        return ataques;
    }

    @Override
    public AcaoDeCombate escolherAcao(Combatente alvo) {
        return new AtaqueBasico(ataques);
    }
}
