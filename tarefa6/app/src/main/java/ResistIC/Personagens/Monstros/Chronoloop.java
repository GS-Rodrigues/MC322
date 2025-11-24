package ResistIC.Personagens.Monstros;

import java.util.Random;

import javax.xml.bind.annotation.XmlRootElement;

import ResistIC.Habilidades.AtaqueBasico;
import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.Interfaces.Item;
import ResistIC.Suporte.ConsoleColors;
import ResistIC.itens.Armas.PixelStorm;
import ResistIC.itens.Armas.Turing_Hammer;

/**
 * Uma especialização concreta de {@link Monstro}.
 * 
 * Representa o monstro <strong>Chronoloop</strong>, uma manifestação anômala
 * dos experimentos temporais
 * conduzidos pelo Instituto de Física.
 * 
 * <p>
 * Resultado de um teste fracassado com loops temporais, Chronoloop é um robô
 * preso entre instantes de tempo —
 * condenado a reviver o mesmo segundo infinitas vezes. A cada repetição, ele
 * aprende, recalibra e torna-se mais rápido,
 * transformando cada confronto em um ciclo quase impossível de quebrar.
 * Derrotá-lo exige mais que força: exige entender
 * o momento exato de agir.
 * </p>
 * 
 */
@XmlRootElement
public class Chronoloop extends Monstro {
    Random gerador = new Random();

    /**
     * Constrói um novo monstro Chronoloop com a arma {@link PixelStorm} e
     * define suas ações de combate iniciais.
     */
    public Chronoloop() {
        super("Chronoloop", 150, 30, 150, new PixelStorm());
    }

    /**
     * Lista de descrições possíveis dos ataques realizados por Chronoloop.
     */
    private static final String[] ataques = {
            "lança um ataque de código corrompido!",
            "sobrecarrega o sistema com loops infinitos!",
            "injeta vírus digitais devastadores!",
            "distorce a realidade virtual e causa instabilidade!",
            "emite uma onda de dados corrompidos que frita circuitos!"
    };

    /**
     * Descrição / história do monstro
     */
    public static final String descricao = ConsoleColors.PURPLE + "Chronoloop" + ConsoleColors.RESET
            + ": Resultado de um experimento falho do Instituto de Física com loops temporais, "
            + "ChronoLoop é um robô preso entre instantes de tempo. Ele vive o mesmo segundo infinitas vezes "
            + "— mas com cada repetição, aprende, recalibra e reage mais rápido. Vencê-lo é possível, mas só se você entender quando"
            + " atacar, e não apenas como.";

    /**
     * Retorna as descrições dos ataques disponíveis para o monstro.
     *
     * @return vetor de descrições de ataque
     */
    @Override
    public String[] getDescricoesDeAtaque() {
        return ataques;
    }

    /**
     * Escolhe automaticamente a ação de combate a ser executada
     * 
     * @param alvo inimigo ou combatente alvo
     * @return ação de combate selecionada
     */
    @Override
    public AcaoDeCombate escolherAcao(Combatente alvo) {
        return new AtaqueBasico(ataques);
    }

    /**
     * Define o item deixado como recompensa ao derrota-lo.
     *
     * @return um novo {@link Turing_Hammer} como loot
     */
    public Item droparLoot() {
        Item item = new Turing_Hammer();
        return item;
    }
}
