package ResistIC.Logica;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import org.junit.jupiter.api.*;

/**
 * Testes unitários para a classe InputManager.
 */
public class InputManagerTest {

    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUpStreams() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); // Captura System.out
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testLerInteiroEntradaValida() {
        String simulatedInput = "5\n"; // o usuário digita 5 e aperta Enter
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        int resultado = InputManager.lerInteiro("Digite um número:", 1, 10);

        assertEquals(5, resultado, "O valor retornado deve ser 5");
    }

    @Test
    void testLerInteiroEntradaInvalidaDepoisValida() {
        // Simula alguem digitando "abc" (inválido), depois "12" (fora do intervalo), depois "8" (válido)
        String simulatedInput = "abc\n12\n8\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        int resultado = InputManager.lerInteiro("Digite:", 1, 10);

        // deve ignorar as entradas erradas e aceitar o 8
        assertEquals(8, resultado);
        assertTrue(outputStream.toString().contains("⚠️ Entrada inválida"), 
                "Deve mostrar aviso de entrada inválida");
        assertTrue(outputStream.toString().contains("⚠️ Valor fora do intervalo"),
                "Deve mostrar aviso de valor fora do intervalo");
    }

    @Test
    void testLerString() {
        String simulatedInput = "Monte Verde\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        String resultado = InputManager.lerString("Destino:");
        assertEquals("Monte Verde", resultado);
    }

    @Test
    void testLerSimNao() {
        String simulatedInput = "s\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        boolean resultado = InputManager.lerSimNao("Deseja continuar?");
        assertTrue(resultado, "Deve retornar true para 's'");
    }

    @Test
    void testLerSimNaoNao() {
        String simulatedInput = "n\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        boolean resultado = InputManager.lerSimNao("Deseja sair?");
        assertFalse(resultado, "Deve retornar false para 'n'");
    }
}
