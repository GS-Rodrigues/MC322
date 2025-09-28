package ResistIC.Logica;

import java.util.Scanner;

public class InputManager {
    private static final Scanner scanner = new Scanner(System.in);

    // Exibe a mensagem, lê um inteiro e garante que ele esteja dentro do intervalo
    // [min, max].
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

    // Exibe a mensagem e lê uma linha de texto.
    public static String lerString(String mensagem) {
        System.out.print(mensagem + " ");
        return scanner.nextLine();
    }

    // Exibe a mensagem (que deve terminarcom (s/n)), lˆe a entrada e retorna true
    // para s e false para n (ignorando mai ́usculas/min ́usculas). Deve repetir o
    // pedido para qualquer outra entrada.
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

    // Exibe a mensagem (ex: Pressione ENTER para continuar...) e pausa a execução
    // até que o usuário pressione a tecla Enter.
    public static void esperarEnter(String mensagem) {
        System.out.print(mensagem + " ");
        scanner.nextLine();
    };

    // Expõe um método para fechar o objeto Scanner subjacente, evitando
    // vazamento de recursos. Deve ser chamado uma ́unica vez no final do programa.
    public static void fecharScanner() {
        scanner.close();
    };
}
