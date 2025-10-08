package ResistIC.Personagens.Monstros;

import java.util.Random;

import ResistIC.Habilidades.AtaqueBasico;
import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.Interfaces.Item;
import ResistIC.Suporte.ConsoleColors;
import ResistIC.itens.Armas.PixelStorm;
import ResistIC.itens.Armas.Turing_Hammer;

public class Chronoloop extends Monstro {
    public Chronoloop() {
        super("Chronoloop", 150, 30, 150, new PixelStorm());
    }

    private static final String[] ataques = {
            "lança um ataque de código corrompido!",
            "sobrecarrega o sistema com loops infinitos!",
            "injeta vírus digitais devastadores!",
            "distorce a realidade virtual e causa instabilidade!",
            "emite uma onda de dados corrompidos que frita circuitos!"
    };

    Random gerador = new Random();

    public static final String descricao = ConsoleColors.PURPLE + "Chronoloop" + ConsoleColors.RESET
    +": Resultado de um experimento falho do Instituto de Física com loops temporais, "
    + "ChronoLoop é um robô preso entre instantes de tempo. Ele vive o mesmo segundo infinitas vezes "
    + "— mas com cada repetição, aprende, recalibra e reage mais rápido. Vencê-lo é possível, mas só se você entender quando"
    + " atacar, e não apenas como.";
    
    @Override
    public String[] getDescricoesDeAtaque() {
        return ataques;
    }

    @Override
    public AcaoDeCombate escolherAcao(Combatente alvo) {
        return new AtaqueBasico(ataques);
    }

    public Item droparLoot() {
        Item item = new Turing_Hammer();
        return item;
    }
}
