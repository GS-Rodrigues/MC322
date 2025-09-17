package ResistIC.Habilidades;

import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.Personagens.Herois.Heroi;

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

        if (p.getSorte() >= 0.75) {
            System.out.println(
                    "ACERTA! (DANO CRÍTICO): Ativa uma busca combinatória massiva sobre todas as possíveis configurações "
                            + "do inimigo, identifica todos os pontos de fraqueza e aplica a solução de dano máximo");
            alvo.receberDano(2 * (p.getForca() + p.getArma().getdano()));
        } else {
            System.out.println("ERRA! Não causa dano no inimigo!");
        }
    }
}
