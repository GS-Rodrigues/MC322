package ResistIC.Habilidades;

import java.util.Random;
import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;

/**
 * Representa uma ação de combate básica em que um {@link Combatente}
 * realiza um ataque físico simples contra outro.
 *
 * <p>
 * O ataque utiliza uma das frases fornecidas aleatoriamente
 * e calcula o dano com base na força do usuário e no dano da arma equipada.
 * </p>
 *
 * <p>
 * Se o alvo for derrotado (ou seja, sua vida chegar a 0 ou menos),
 * uma mensagem adicional é exibida informando sua derrota.
 * </p>
 *
 * @author Guilherme & Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public class AtaqueBasico implements AcaoDeCombate {
    private String[] frases;
    private Random gerador = new Random();

    public AtaqueBasico(String[] frases) {
        this.frases = frases;
    }

    @Override
    public void executar(Combatente usuario, Combatente alvo) {

        String ataque = frases[gerador.nextInt(frases.length)];

        int dano = usuario.getForca() + usuario.getArma().getdano();

        alvo.receberDano(dano);

        System.out.printf("%-20s -> %-40s (dano: %d) | Vida do inimigo: %d\n",
                usuario.getNome(), ataque, dano, alvo.getVida());

        if (!alvo.estaVivo()) {
            System.out.printf("%s FOI DERROTADO\n", alvo.getNome());
        }
        ;

    }
}