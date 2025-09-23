package ResistIC.Habilidades;
import java.util.Random;

import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;

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