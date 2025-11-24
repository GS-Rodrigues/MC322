package ResistIC.Logica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import ResistIC.Personagens.Monstros.*;

class ConstrutorDeCenarioFixoTest {

    private ConstrutorDeCenarioFixo construtor;

    @BeforeEach
    void setUp() {
        construtor = new ConstrutorDeCenarioFixo();
    }

    @Test
    void testeGerarNumeroFases() {
        ArrayList<FaseDeCombate> fases = construtor.gerar(3, Dificuldade.NORMAL);
        assertEquals(3, fases.size(), "Deve gerar 3 fases");
    }

    @Test
    void testeConteudoDasFases() {
        ArrayList<FaseDeCombate> fases = construtor.gerar(3, Dificuldade.NORMAL);

        // Verifica o tipo de cada monstro e cenário
        assertTrue(fases.get(0).getMonstro() instanceof Genomex, "Fase 0 deve ter Genomex");
        assertTrue(fases.get(1).getMonstro() instanceof Chronoloop, "Fase 1 deve ter Chronoloop");
        assertTrue(fases.get(2).getMonstro() instanceof Canvaspecter, "Fase 2 deve ter Canvaspecter");

        assertEquals(TipoCenario.INSTITUTO_DE_BIOLOGICAS, fases.get(0).getTipoDeCenario(), "Fase 0 deve ter tipo INSTITUTO_DE_BIOLOGICAS");
        assertEquals(TipoCenario.INSTITUTO_DE_HUMANAS, fases.get(1).getTipoDeCenario(), "Fase 1 deve ter tipo INSTITUTO_DE_HUMANAS");
        assertEquals(TipoCenario.INSTITUTO_DE_EXATAS, fases.get(2).getTipoDeCenario(), "Fase 2 deve ter tipo INSTITUTO_DE_EXATAS");
    }

    @Test
    void testeDificuldadeAplicada() {
        ArrayList<FaseDeCombate> fases = construtor.gerar(3, Dificuldade.DIFICIL);

        for (FaseDeCombate fase : fases) {
            assertEquals(Dificuldade.DIFICIL, fase.getDificuldade(), "Cada fase deve ter dificuldade DIFICIL");
        }
    }

    @Test
    void testeZeroFases() {
        ArrayList<FaseDeCombate> fases = construtor.gerar(0, Dificuldade.FACIL);
        assertTrue(fases.isEmpty(), "Se nFases = 0, lista deve ser vazia");
    }
}
