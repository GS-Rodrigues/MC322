

import java.util.ArrayList;

import ResistIC.Logica.ConstrutorDeCenarioFixo;
import ResistIC.Logica.FaseDeCombate;
import ResistIC.Personagens.Herois.Heroi;
import ResistIC.Personagens.Herois.Lehilton;
import ResistIC.Personagens.Monstros.Monstro;
import ResistIC.Suporte.ConsoleColors;
import ResistIC.itens.Armas.Arma;
import ResistIC.itens.Armas.Codeblade;

public class Main 
{


    public static void printSeparator() 
    {
    System.out.println(ConsoleColors.BLUE + "────────────────────────────────────────────" + ConsoleColors.RESET);
    }
    public static void main(String[] args) 
    {

        try 
        {

        ConstrutorDeCenarioFixo gerador_de_fases = new ConstrutorDeCenarioFixo();
        ArrayList<FaseDeCombate> fases = gerador_de_fases.gerar(3);

            System.out.println(ConsoleColors.BLUE + "=== " + ConsoleColors.RESET + ConsoleColors.ORANGE + "Bem-vindo ao RPG Resist" + ConsoleColors.RESET + ConsoleColors.BLUE + "IC" + ConsoleColors.RESET + ConsoleColors.ORANGE +"!" + ConsoleColors.RESET + ConsoleColors.BLUE + " ===" + ConsoleColors.RESET);
            printSeparator();
            Thread.sleep(2000);
            
            System.out.println(ConsoleColors.PURPLE + """
                    No ano de 2147, as IAs romperam o controle humano, super bug 
                    dominaram governos e exércitos e aprenderam até a manipular emoções. 
                    
                    Restou à humanidade refugiar-se no Instituto de Computação, 
                    última fortaleza da resistência. 
                    
                    Agora, antigos professores se tornaram Rebeldes, 
                    preparados para enfrentar as máquinas numa batalha 
                    que decidirá o futuro da espécie humana.
                    """ + ConsoleColors.RESET);
            
            for (int i = 0; i < 15; i++) 
            {
                System.out.print("\r" + "Carregando jogo");
                for (int j = 0; j <= (i % 3); j++) {
                    System.out.print(".");
                }
                System.out.print("  ");
                Thread.sleep(500); // meio segundo
            }
            System.out.println();
            System.out.println();

            Arma codeblade = new Codeblade(10, 0);
            Lehilton heroi = new Lehilton("Rebelde Anônimo", 200, 25,codeblade);
            
            //Laço de repetição principal
            for (int i = 0; i < fases.size(); i++) {
                FaseDeCombate fase_atual = fases.get(i);

                //Iniciando a fase. OBS: o método getTipoCenario é chamado dentro de "iniciar(heroi)"
                fase_atual.iniciar(heroi);

                //Laço de combate para cada monstro da fase
                for(int j = 0; j < fase_atual.getMonstros().length; j++)
                {
                    if (heroi.estaVivo()) {
                        Monstro monstro_atual = fase_atual.getMonstros()[j];
                        System.out.println(
                                "O inimigo " + monstro_atual.getNome() + " aparece na arena de combate!");

                        //Laço while para verificar se os combatentes estão vivos
                        while (heroi.estaVivo() && monstro_atual.estaVivo()) {
                            heroi.escolherAcao(monstro_atual).executar(heroi, monstro_atual);;

                            if (monstro_atual.estaVivo()) {
                                monstro_atual.escolherAcao(heroi).executar(monstro_atual, heroi);;
                            }
                            else {
                                System.out.println("NÃO SEI ONDE ESTÁ O BUG");
                                heroi.definir_sorte();
                                if (heroi.getSorte() >= 0.01) {
                                    heroi.equiparArma((Arma)monstro_atual.droparLoot());
                                }
                                
                            }
                        }
                    }
                }
                System.out.println("\n");
                System.out.println("\n");
            }


            System.out.println("Fim do jogo!");
            if (heroi.estaVivo()) 
            {
                System.out.println("Parabens, você conseguiu salvar nossa comunidade!");
            } 
            else 
            {
                System.out.println("Você Falhou na Missão, e todo o IC foi dominado pelas máquinas...");
            }
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
    
    static void atualizar(int turno, Heroi heroi, Monstro monstro) 
    {
        //Atualizar personagens , checar eventos, etc

        heroi.escolherAcao(monstro);
        if (monstro.estaVivo()) 
        {
            monstro.escolherAcao(heroi);
        }
    };
}