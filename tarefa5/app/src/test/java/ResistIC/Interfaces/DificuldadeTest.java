package ResistIC.Interfaces;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ResistIC.Logica.Dificuldade;
import ResistIC.Personagens.Monstros.Chronoloop;

public class DificuldadeTest {
    
    @Test
    void testeVidaEForcaComDificuldade() {
        // Cria dois monstros Chronoloop em diferentes "dificuldades"
        Chronoloop facil = new Chronoloop();
        Chronoloop dificil = new Chronoloop();

        // Aplica multiplicadores do enum
        int vidaFacil = (int) (facil.getVida() * Dificuldade.FACIL.getMultiplicadorForcaVidaMonstro());
        int vidaDificil = (int) (dificil.getVida() * Dificuldade.DIFICIL.getMultiplicadorForcaVidaMonstro());

        int forcaFacil = (int) (facil.getForca() * Dificuldade.FACIL.getMultiplicadorForcaVidaMonstro());
        int forcaDificil = (int) (dificil.getForca() * Dificuldade.DIFICIL.getMultiplicadorForcaVidaMonstro());

        // Vida maior para dificuldade maior
        assertTrue(vidaDificil > vidaFacil, "Monstro difícil deve ter mais vida que monstro fácil");

        // Força maior para dificuldade maior
        assertTrue(forcaDificil > forcaFacil, "Monstro difícil deve ter mais força que monstro fácil");
    }
}