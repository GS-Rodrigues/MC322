package ResistIC.Logica;
import java.util.ArrayList;

import ResistIC.Interfaces.GeradorDeFases;
import ResistIC.Personagens.Monstros.Corrupted_IA;
import ResistIC.Personagens.Monstros.Enxame_Dados;
import ResistIC.Personagens.Monstros.Monstro;
import ResistIC.Personagens.Monstros.Monstro_IB;


public class ConstrutorDeCenarioFixo implements GeradorDeFases {

    //Nome e descrição das fases
    private static final String[] nomeFases =
    {
        "Instituto de Biologia: Uma grande vegetação cobre o imponente prédio, onde pesquisas com perigosos seres biológicos fugiram do controle... O que pode se espreitar por essas bandas? ",
        "Instituto de Artes: bonitas harmonias ecoam pelos corredores, capazes de hipnotizar o mais firme dos combatentes",
        "Instituto de Física Gleb Wataghin - o temido: Uma grande nuvem escura paira sobre o prédio, similar a um hospício. Manchas de sangue tingem o chão de vermelho. Que loucuras se passam ali?"
    };
    
    
    private static final TipoCenario[] tipos_de_cenario =
    {
        TipoCenario.INSTITUTO_DE_BIOLOGICAS,
        TipoCenario.INSTITUTO_DE_HUMANAS,
        TipoCenario.INSTITUTO_DE_EXATAS
    };
    
    private static final Monstro[] monstros = { new Monstro_IB(), new Corrupted_IA(), new Enxame_Dados() };

    public ArrayList<FaseDeCombate> gerar(int nFases, Dificuldade Dificuldade)
    {

        
        ArrayList<FaseDeCombate> fases = new ArrayList<>();
        for (int i = 0; i < nFases; i++) {
            fases.add(new FaseDeCombate(i, nomeFases[i], monstros[i], tipos_de_cenario[i], Dificuldade));
        }
        return fases;
    };
}
