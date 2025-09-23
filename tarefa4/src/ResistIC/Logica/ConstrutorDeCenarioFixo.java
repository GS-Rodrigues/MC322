package ResistIC.Logica;
import java.util.ArrayList;

import ResistIC.Personagens.Monstros.Corrupted_IA;
import ResistIC.Personagens.Monstros.Enxame_Dados;
import ResistIC.Personagens.Monstros.Monstro;
import ResistIC.itens.Armas.Arma;
import ResistIC.itens.Armas.Codeblade;
import ResistIC.itens.Armas.Turing_Hammer;


public class ConstrutorDeCenarioFixo {

    //Nome e descrição das fases
    private static final String[] nomeFases =
    {
        "Ciclo Básico 1: Dois grandes círculos, escadarias, escuridão... Anfiteatros que um dia abrigaram brilhantes alunos agora abrigam terríveis inimigos",
        "Instituto de Artes: Bonitos sons se espalham pelos corredores do prédio, hipnotizando até o mais firme dos combatentes...",
        "Instituto de Biologia: Uma grande vegetação cobre o imponente prédio, onde pesquisas com perigosos seres biológicos fugiram do controle... O que pode se espreitar por essas bandas? ",
        "Instituto de Química: Forte radiação emana dos laboratórios destruídos, onde corpos de brilhantes químicos estão em decomposição",
        "Instituto de Física Gleb Wataghin - o temido: Uma grande nuvem escura paira sobre o prédio, similar a um hospício. Manchas de sangue tingem o chão de vermelho. Que loucuras se passam ali?"
            };
    
    
    
    //Vetor de nomes do primeiro monstro para cada fase
    private static final String[] nomeMonstros1 =
    {
        "Ciborgue genérico","Autômato fractal", "Vírus binário","Sinal Ionizante","Algoritmo pendular demoníaco"};
    
    //Vetor de nome do segundo mosntro para cada fase
    private static final String[] nomeMonstros2=
    {
        "Droide discreto", "Algebrista dançante", "Bactéria indutiva", "Bug Sulfúrico", "Entidade experimental implacável"
            };
    
    
    private static final TipoCenario[] tipos_de_cenario =
    {
        TipoCenario.INSTITUTO_GENÉRICO,
        TipoCenario.INSTITUTO_DE_HUMANAS,
        TipoCenario.INSTITUTO_DE_BIOLOGICAS,
        TipoCenario.INSTITUTO_DE_EXATAS,
        TipoCenario.INSTITUTO_DE_EXATAS
    };

    public ArrayList<FaseDeCombate> gerar(int nFases)
    {
    Arma codeblade = new Codeblade(10, 0);
    Arma hammer = new Turing_Hammer(20, 1);
        
        ArrayList<FaseDeCombate> fases = new ArrayList<>();
        for (int i = 0; i < nFases; i++) {
            Monstro monstro1 = new Corrupted_IA(nomeMonstros1[i], 100 + 20*(i+1), 5 +5*(i+1), codeblade );
            Monstro monstro2 = new Enxame_Dados(nomeMonstros2[i], 100 + 20*(i+1), 5 +5*(i+1),hammer);
            Monstro[] monstrosDaFase = new Monstro[] {monstro1, monstro2};
            fases.add(new FaseDeCombate(i, nomeFases[i], monstrosDaFase, tipos_de_cenario[i]));
        }
        return fases;
    };
}
