package ResistIC.Habilidades;

import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.Personagens.Herois.Heroi;

/**
 * Representa uma ação de combate especial em que um {@link Heroi}
 * utiliza sua habilidade única para tentar causar um ataque crítico.
 *
 * <p>
 * A chance de sucesso depende do valor de sorte do herói.
 * Caso a sorte seja suficiente, o ataque causa dano crítico (o dobro do dano
 * normal),
 * caso contrário, o golpe falha e nenhum dano é causado.
 * </p>
 *
 * <p>
 * O ataque é descrito com mensagens narrativas.
 * </p>
 *
 * @author Guilherme & Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public class HabilidadeEspecial implements AcaoDeCombate {
    private String especialidade;

    public HabilidadeEspecial(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void executar(Combatente usuario, Combatente alvo) {

        Heroi p = (Heroi) usuario;
        p.definir_sorte();

        System.out.printf("%s se concentra, usa sua %s preparando um ataque brutal. Desfere o golpe e: ",
                p.getNome(), especialidade);

        if (p.getSorte() >= 0.30) {
            System.out.println(
                    "ACERTA! (DANO CRÍTICO): Ativa uma busca combinatória massiva sobre todas as possíveis configurações "
                            + "do inimigo, identifica todos os pontos de fraqueza e aplica a solução de dano máximo");
            alvo.receberDano(2 * (p.getForca() + p.getArma().getdano()));

            if (!alvo.estaVivo()) {
                System.out.printf("%s FOI DERROTADO\n", alvo.getNome());
            }
        } else {
            System.out.println("ERRA! Não causa dano no inimigo!");
        }
    }
}
