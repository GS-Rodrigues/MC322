package ResistIC.Personagens.Monstros;

import java.util.Random;

import ResistIC.Habilidades.AtaqueBasico;
import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.Interfaces.Item;
import ResistIC.Suporte.ConsoleColors;
import ResistIC.itens.Armas.Codeblade;
import ResistIC.itens.Armas.Quanta_Cutter;

public class Canvaspecter extends Monstro {
    private static final String[] ataques = {
            "invade o sistema, corrompendo suas defesas!",
            "lança milhares de pacotes binários como insetos digitais contra você!",
            "te envolve em uma nuvem caótica de informação letal!",
            "lança fragmentos de código em fúria em você sem piedade!",
            "sobrecarrega seus circuitos com loops infinitos!",
            "lança uma tempestade de bits envenenados que drenam sua energia vital!"
    };

    Random gerador = new Random();

    public Canvaspecter() {
        super("Canvaspecter", 200, 40, 200,new Quanta_Cutter());
    }

    public static final String descricao = ConsoleColors.PURPLE + "Canvaspecter" + ConsoleColors.RESET
    +": Nascido do código inacabado de uma instalação artística digital, Canvaspecter é um espectro"
    + " errante que habita espaços de memória corrompida. Sua forma oscila entre camadas de glitchs visuais e traços de pincel vetorial."
    + " Não ataca com força, mas distorce a percepção da realidade, fazendo com que o próprio cenário vire uma armadilha.";

    public Item droparLoot() {
        Item item = new Codeblade();
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
