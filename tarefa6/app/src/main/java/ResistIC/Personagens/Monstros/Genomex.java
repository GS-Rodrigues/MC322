package ResistIC.Personagens.Monstros;

import java.util.Random;

import javax.xml.bind.annotation.XmlRootElement;

import ResistIC.Habilidades.AtaqueBasico;
import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.Interfaces.Item;
import ResistIC.Suporte.ConsoleColors;
import ResistIC.itens.Armas.Codeblade;
import ResistIC.itens.Armas.Cortex_Distorter;
import ResistIC.itens.Armas.Quanta_Cutter;

/**
 * Representa o mostro Genomex, uma especialização concreta de {@link Monstro}.
 * 
 */
@XmlRootElement
public class Genomex extends Monstro {
    Random gerador = new Random();

    /**
     * Constrói um novo monstro Genomex com a arma {@link Quanta_Cutter} e
     * define suas ações de combate iniciais.
     */
    public Genomex() {
        super("Genomex", 100, 20, 100, new Cortex_Distorter());
    }

    /**
     * Lista de descrições possíveis dos ataques realizados por Genomex.
     */
    private static final String[] ataques = {
            "invade o sistema, corrompendo suas defesas!",
            "lança milhares de pacotes binários como insetos digitais contra você!",
            "te envolve em uma nuvem caótica de informação letal!",
            "lança fragmentos de código em fúria em você sem piedade!",
            "sobrecarrega seus circuitos com loops infinitos!",
            "lança uma tempestade de bits envenenados que drenam sua energia vital!"
    };

    /**
     * Descrição / história do monstro
     */
    public static final String descricao = ConsoleColors.PURPLE + "Genomex" + ConsoleColors.RESET
            + ": Genomex foi criado como uma simulação evolutiva de organismos digitais"
            + "— mas ele escapou do ambiente de teste. Com código genético mutável e uma IA adaptativa, ele evolui a cada conflito."
            + " Seus ataques são imprevisíveis, e sua forma nunca é a mesma por muito tempo."
            + " O combate contra Genomex é uma corrida entre sua evolução e sua destruição.";
            
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
     * @return uma nova {@link Codeblade} como loot
     */
        public Item droparLoot() {
            Item item = new Codeblade();
            return item;
        }
}
