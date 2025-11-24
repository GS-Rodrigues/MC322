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
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public class HabilidadeEspecial implements AcaoDeCombate {
    private String especialidade;

    /**
 * Cria uma instância de HabilidadeEspecial com uma especialidade do personagem
 *
 * @param especialidade Especialidade do personagem 
 */
    public HabilidadeEspecial(String especialidade) {
        this.especialidade = especialidade;
    }

/**
 * Executa a habilidade especial do herói sobre o alvo.
 * 
 * <p>
 * Calcula a sorte do usuário e decide se o ataque acerta ou erra:
 * </p>
 * <ul>
 *   <li>Se a sorte for >= 0.30, aplica dano crítico dobrado baseado na força do usuário e da arma.</li>
 *   <li>Se a sorte for &lt; 0.30, o ataque erra e não causa dano.</li>
 * </ul>
 * 
 * @param usuario O combatente que realiza a ação (deve ser um {@link Heroi}).
 * @param alvo O combatente alvo que receberá o dano.
 */
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
