package ResistIC.Logica;

import ResistIC.Interfaces.Fase;
import ResistIC.Personagens.Monstros.Monstro;
import ResistIC.Personagens.Herois.Heroi;

/**
 * Representa uma fase de combate do jogo.
 *
 * <p>
 * Cada {@code FaseDeCombate} possui um número de fase, um ambiente,
 * um monstro inimigo, um tipo de cenário e uma dificuldade.
 * </p>
 *
 * <p>
 * A dificuldade influencia a força e a vida do monstro automaticamente
 * ao criar a fase.
 * </p>
 *
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-12
 */
public class FaseDeCombate implements Fase {
    /** Número da fase no jogo. */
    private int numero_da_fase;

    /** Descrição do ambiente da fase. */
    private String ambiente;

    /** Monstro que será enfrentado nesta fase. */
    private Monstro monstro;

    /** Tipo de cenário em que a fase ocorre. */
    private TipoCenario Tipo_de_Cenario;

    /** Dificuldade da fase. */
    private Dificuldade dificuldade;

    /**
     * Constrói uma nova {@code FaseDeCombate}.
     *
     * <p>
     * Ajusta automaticamente os atributos do monstro de acordo com a dificuldade.
     * </p>
     *
     * @param numero_da_fase  número da fase.
     * @param ambiente        descrição do ambiente.
     * @param monstro         monstro a ser enfrentado.
     * @param Tipo_de_Cenario tipo de cenário da fase.
     * @param dificuldade     dificuldade da fase.
     */
    public FaseDeCombate(int numero_da_fase, String ambiente, Monstro monstro, TipoCenario Tipo_de_Cenario,
            Dificuldade dificuldade) {
        this.numero_da_fase = numero_da_fase;
        this.ambiente = ambiente;
        this.monstro = monstro;
        this.Tipo_de_Cenario = Tipo_de_Cenario;
        this.dificuldade = dificuldade;
        adequarInimigosDificuldade();
    }

    /**
     * Inicia a fase de combate para o herói especificado.
     *
     * <p>
     * Exibe o ambiente, apresenta informações do cenário e o status do herói.
     * </p>
     *
     * @param heroi herói que participará da fase.
     */
    public void iniciar(Heroi heroi) {
        System.out.println(this.getAmbiente());
        this.Tipo_de_Cenario.apresentarInformacoesCenario();
        try {
            Thread.sleep(4000);
            heroi.exibirStatus();
        } catch (InterruptedException e) {
            e.printStackTrace();
            ;
        }
    }

    /**
     * Ajusta a vida e força do monstro de acordo com o multiplicador da
     * dificuldade.
     */
    private void adequarInimigosDificuldade() {
        this.monstro.setPontosDeVida(dificuldade.getMultiplicadorForcaVidaMonstro());
        this.monstro.setForca(dificuldade.getMultiplicadorForcaVidaMonstro());
    }

    /**
     * Retorna o tipo de cenário da fase.
     *
     * @return tipo de cenário.
     */
    public TipoCenario getTipoDeCenario() {
        return Tipo_de_Cenario;
    }

    public Dificuldade getDificuldade(){
        return this.dificuldade;
    }

    // public boolean isConcluida() {
    // boolean esta_concluida = true;
    // int i = 0;
    // while(esta_concluida ee i < monstros.length)
    // {
    // if (monstros[i].estaVivo()) {
    // return false;
    // }
    // }
    // return true;
    // }

    /**
     * Retorna o número da fase.
     *
     * @return número da fase.
     */
    public int getNivel() {
        return numero_da_fase;
    }

    /**
     * Retorna a descrição do ambiente da fase.
     *
     * @return descrição do ambiente.
     */
    public String getAmbiente() {
        return ambiente;
    }

    /**
     * Retorna o monstro associado à fase.
     *
     * @return monstro da fase.
     */
    public Monstro getMonstro() {
        return monstro;
    }

}
