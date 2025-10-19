package ResistIC.Personagens.Herois;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ResistIC.Interfaces.Combatente;
import ResistIC.Personagens.Personagem;

public class HeroiTest {

    private Lehilton heroi;
    private Lehilton inimigo;

    @BeforeEach
    void setUp() {
        heroi = new Lehilton("Lehilton", 0.1);
        inimigo = new Lehilton("Lehilton", 0.1);
    }

    @Test
    void testeReceberDano() {
        int vidaInicial = inimigo.getVida();
        inimigo.receberDano(31);
        assertEquals(vidaInicial - 31, inimigo.getVida(), "Inimigo deve perder 30 de vida");
    }

    @Test
    void testeReceberCura() {
        int vidaInicial = heroi.getVida();
        heroi.receberCura(1);
        assertEquals(vidaInicial + 1, heroi.getVida(), "Heroi deve ganhar 1 de vida");
    }

    @Test
    void testeEscolherAcao() {
        inimigo.receberDano(80); // vida <= 30
        assertEquals("AtaqueBasico",
                heroi.escolherAcao(inimigo).getClass().getSimpleName(),
                "Deve escolher AtaqueBasico para inimigo com pouca vida");

        inimigo.receberDano(-50); // vida > 30
        assertEquals("HabilidadeEspecial",
                heroi.escolherAcao(inimigo).getClass().getSimpleName(),
                "Deve escolher HabilidadeEspecial para inimigo com vida alta");
    }

    /**
     * Verifica se Heroi implementa Combatente
     */
    @Test
    void deveImplementarInterfaceCombatente() {

        boolean implementa = Combatente.class.isAssignableFrom(Heroi.class);

        assertTrue(implementa,
                "A classe Heroi deve implementar a interface Combatente");
    }

    /**
     * Verifica se Heroi herda de Personagem
     */
    @Test
    void deveImplementarInterfacePersonagem() {

        boolean Herda = Personagem.class.isAssignableFrom(Heroi.class);

        assertTrue(Herda,
                "A classe Heroi deve Herdar da Classe Personagem");
    }

}
