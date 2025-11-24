package ResistIC.Personagens.Monstros;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ResistIC.Interfaces.Combatente;
import ResistIC.Interfaces.Lootavel;
import ResistIC.Personagens.Personagem;
import ResistIC.Personagens.Herois.Heroi;

public class MonstroTest {

    private Genomex heroi;
    private Genomex inimigo;

    @BeforeEach
    void setUp() {
        heroi = new Genomex();
        inimigo = new Genomex();
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
        assertEquals(vidaInicial + 1, heroi.getVida(), "Monstro deve ganhar 1 de vida");
    }

    @Test
    void testeEscolherAcao() {
        inimigo.receberDano(80); // vida <= 30
        assertEquals("AtaqueBasico",
                heroi.escolherAcao(inimigo).getClass().getSimpleName(),
                "Deve sempre escolher AtaqueBasico");
    }

    /**
     * Verifica se Monstro implementa Combatente
     */
    @Test
    void deveImplementarInterfaceCombatente() {

        boolean implementa = Combatente.class.isAssignableFrom(Monstro.class);

        assertTrue(implementa,
                "A classe Monstro deve implementar a interface Combatente");
    }

    /**
     * Verifica se Monstro implementa Lootavel
     */
    @Test
    void deveImplementarInterfaceLootavel() {

        boolean implementa = Lootavel.class.isAssignableFrom(Monstro.class);

        assertTrue(implementa,
                "A classe Monstro deve implementar a interface Combatente");
    }

    /**
     * Verifica se Monstro herda de Personagem
     */
    @Test
    void deveImplementarInterfacePersonagem() {

        boolean Herda = Personagem.class.isAssignableFrom(Heroi.class);

        assertTrue(Herda,
                "A classe Monstro deve Herdar da Classe Personagem");
    }
}
