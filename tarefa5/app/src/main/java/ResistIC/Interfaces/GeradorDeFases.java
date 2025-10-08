package ResistIC.Interfaces;


import java.util.ArrayList;
import ResistIC.Logica.Dificuldade;
import ResistIC.Logica.FaseDeCombate;

public interface GeradorDeFases {

    public ArrayList<FaseDeCombate> gerar(int quantidadeDeFases, Dificuldade dificuldade);

};