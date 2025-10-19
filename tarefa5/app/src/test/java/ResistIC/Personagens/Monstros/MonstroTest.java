package ResistIC.Personagens.Monstros;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ResistIC.Interfaces.Combatente;

public class MonstroTest {

    /**
     * Verifica se Monstro implementa Combatente
     */
    @Test
    void deveImplementarInterfaceCombatente() {

        boolean implementa = Combatente.class.isAssignableFrom(Monstro.class);

        assertTrue(implementa,
                "A classe Monstro deve implementar a interface Combatente");
    }
}
