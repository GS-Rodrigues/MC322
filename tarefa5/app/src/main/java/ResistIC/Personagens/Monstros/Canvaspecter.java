package ResistIC.Personagens.Monstros;

import java.util.Random;

import ResistIC.Habilidades.AtaqueBasico;
import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.Interfaces.Item;
import ResistIC.Suporte.ConsoleColors;
import ResistIC.itens.Armas.Codeblade;
import ResistIC.itens.Armas.Quanta_Cutter;

/**
 * Representa o mostro Canvaspecter, uma especialização concreta de
 * {@link Monstro}.
 * <p>
 * Surgido de um fragmento corrompido de uma antiga instalação artística
 * virtual,
 * o Canvaspecter é uma entidade que transcende o código e o mundo físico,
 * distorcendo a realidade ao seu redor. Converte algoritmos em pinceladas
 * caóticas
 * e dados em ecos espectrais, manipulando o próprio ambiente — o “canvas” —
 * como
 * arma, transformando o campo de batalha em um labirinto de glitches e ilusões
 * binárias.
 * </p>
 */
public class Canvaspecter extends Monstro {
    Random gerador = new Random();

    /**
     * Constrói um novo monstro Canvaspecter com a arma {@link Quanta_Cutter} e
     * define suas ações de combate iniciais.
     */
    public Canvaspecter() {
        super("Canvaspecter", 200, 40, 200, new Quanta_Cutter());
    }

    /**
     * Lista de descrições possíveis dos ataques realizados por Canvaspecter.
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
    public static final String descricao = ConsoleColors.PURPLE + "Canvaspecter" + ConsoleColors.RESET
            + ": Nascido do código inacabado de uma instalação artística digital, Canvaspecter é um espectro"
            + " errante que habita espaços de memória corrompida. Sua forma oscila entre camadas de glitchs visuais e traços de pincel vetorial."
            + " Não ataca com força, mas distorce a percepção da realidade, fazendo com que o próprio cenário vire uma armadilha.";

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
