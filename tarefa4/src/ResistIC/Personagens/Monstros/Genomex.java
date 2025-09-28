package ResistIC.Personagens.Monstros;

import java.util.Random;

import ResistIC.Habilidades.AtaqueBasico;
import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.Interfaces.Item;
import ResistIC.itens.Armas.Codeblade;
import ResistIC.itens.Armas.Cortex_Distorter;

public class Genomex extends Monstro {
    private static final String[] ataques = {
            "invade o sistema, corrompendo suas defesas!",
            "lança milhares de pacotes binários como insetos digitais contra você!",
            "te envolve em uma nuvem caótica de informação letal!",
            "lança fragmentos de código em fúria em você sem piedade!",
            "sobrecarrega seus circuitos com loops infinitos!",
            "lança uma tempestade de bits envenenados que drenam sua energia vital!"
    };

    Random gerador = new Random();

    public Genomex() {
        super("Genomex", 100, 20, 100, new Cortex_Distorter());
    }

    public String descricao = "Genomex foi criado como uma simulação evolutiva de organismos digitais"
    + "— mas ele escapou do ambiente de teste. Com código genético mutável e uma IA adaptativa, ele evolui a cada conflito."
    + " Seus ataques são imprevisíveis, e sua forma nunca é a mesma por muito tempo."
    + " O combate contra Genomex é uma corrida entre sua evolução e sua destruição.";

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
