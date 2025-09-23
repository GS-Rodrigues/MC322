package ResistIC.Personagens.Herois;
import ResistIC.Habilidades.AtaqueBasico;
import ResistIC.Habilidades.HabilidadeEspecial;
import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Interfaces.Combatente;
import ResistIC.itens.Armas.Arma;

public class Marcelo extends Heroi {

    public Marcelo(String nome, int vida, int forca, Arma arma) {
        super(nome, vida, forca, arma);
    }

    private String especialidade = "Identificação de padrões";

    private static final String[] ataques = {
            "gera um algoritmo de otimização u-curve e aplica um golpe crítico computacional",
            "aplica uma análise proteômica reversa, quebrando as proteínas sintéticas da carcaça do inimigo",
            "identifica padrões nos últimos ataques do inimigo, antecipa o próximo ataque e devolve com dano amplificado!",
            "carrega um dataset sintético massivo nos sensores do robô, colapsando seu processamento!",
            "gera padrões de combate imprevisíveis com uma rede neural combativa, quebrando o sistema de decisão do inimigo!"
    };

    @Override
    public String[] getDescricoesDeAtaque() {
        return ataques;
    }

    @Override
    public AcaoDeCombate escolherAcao(Combatente alvo) {
        if (alvo.getVida() > 30) {
            return new HabilidadeEspecial(especialidade);
        } else {
            return new AtaqueBasico(ataques);
        }
    }

}
