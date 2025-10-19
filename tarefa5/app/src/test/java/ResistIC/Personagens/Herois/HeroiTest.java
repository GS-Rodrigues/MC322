package ResistIC.Personagens.Herois;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ResistIC.Interfaces.Combatente;

public class HeroiTest {

    /**
     * Verifica se Heroi implementa Combatente
     */
    @Test
    void deveImplementarInterfaceCombatente() {

        boolean implementa = Combatente.class.isAssignableFrom(Heroi.class);

        assertTrue(implementa,
                "A classe Heroi deve implementar a interface Combatente");
    }
}
