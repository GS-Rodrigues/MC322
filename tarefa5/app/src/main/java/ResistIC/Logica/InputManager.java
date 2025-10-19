package ResistIC.Logica;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Gerencia a entrada de dados do usuário.
 *
 * <p>
 * A classe {@code InputManager} fornece métodos estáticos para ler as entradas
 * do usuário.
 * </p>
 *
 * <p>
 * Todos os métodos usam internamente um {@link Scanner} único e estático.
 * </p>
 *
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-12
 */
public class InputManager {

    /** Construtor sem argumentos */
    protected InputManager() {
    }

    /** Scanner único para capturar entradas do usuário. */
    private static Scanner scanner = new Scanner(System.in);

    /** Reset do scanner */
    public static void setScanner(InputStream in) {
        scanner = new Scanner(in);
    }

    /**
     * Lê um número inteiro dentro de um intervalo [min, max].
     *
     * @param mensagem mensagem a ser exibida para o usuário.
     * @param min      valor mínimo aceito.
     * @param max      valor máximo aceito.
     * @return inteiro válido digitado pelo usuário.
     */
    public static int lerInteiro(String mensagem, int min, int max) {
        int valor;
        while (true) {
            System.out.print(mensagem + " ");
            try {
                valor = Integer.parseInt(scanner.nextLine().trim());
                if (valor >= min && valor <= max) {
                    return valor;
                } else {
                    System.out.println();
                    System.out.println("⚠️ Valor fora do intervalo [" + min + ", " + max + "]. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("⚠️ Entrada inválida. Digite um número inteiro.");
            }
        }
    };

    /**
     * Lê uma linha de texto digitada pelo usuário.
     *
     * @param mensagem mensagem a ser exibida para o usuário.
     * @return texto digitado pelo usuário.
     */
    public static String lerString(String mensagem) {
        System.out.print(mensagem + " ");
        return scanner.nextLine();
    }

    /**
     * Lê uma resposta do tipo sim/não (s/n).
     *
     * <p>
     * Repete a solicitação até que o usuário digite 's' ou 'n', ignorando
     * maiúsculas/minúsculas.
     * </p>
     *
     * @param mensagem mensagem a ser exibida para o usuário (deve indicar s/n).
     * @return {@code true} se o usuário digitar 's', {@code false} se digitar 'n'.
     */
    public static boolean lerSimNao(String mensagem) {
        char valor;
        while (true) {
            System.out.print(mensagem + " " + "(s/n)");
            valor = scanner.next().trim().toLowerCase().charAt(0); // Não diferencia maiusculo e ignora espaços
            if (valor == 's') {
                return true;
            } else if (valor == 'n') {
                return false;
            } else {
                System.out.println();
                System.out.println("⚠️ Entrada inválida. Digite s ou n");
            }
        }
    };

    /**
     * Pausa a execução do programa até que o usuário pressione Enter.
     *
     * @param mensagem mensagem exibida antes de esperar o Enter.
     */
    public static void esperarEnter(String mensagem) {
        System.out.print(mensagem + " ");
        scanner.nextLine();
    };

    /**
     * Fecha o {@link Scanner} utilizado pela classe, evitando vazamento de
     * recursos.
     *
     * <p>
     * Deve ser chamado apenas uma vez, no final do programa.
     * </p>
     */
    public static void fecharScanner() {
        scanner.close();
    };
}
