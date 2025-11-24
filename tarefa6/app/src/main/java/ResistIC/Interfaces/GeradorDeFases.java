package ResistIC.Interfaces;

import java.util.ArrayList;
import ResistIC.Logica.Dificuldade;
import ResistIC.Logica.FaseDeCombate;

/**
 * Representa um objeto capaz de gerar uma sequência de fases para o RPG.
 *
 *
 * <p>
 * Esta interface pode ser implementada pela classe responsavel por construir os
 * cenários do RPG.
 * </p>
 *
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-08
 */
public interface GeradorDeFases {

    /**
     * Gera uma sequencia de fases com uma certa dificuldade selecionada.
     *
     * @param quantidadeDeFases quantidade de fases a serem geradas
     * @param dificuldade       dificuldade das fases a serem geradas.
     * 
     * @return uma lista de {@link FaseDeCombate}
     */
    public ArrayList<FaseDeCombate> gerar(int quantidadeDeFases, Dificuldade dificuldade);

};