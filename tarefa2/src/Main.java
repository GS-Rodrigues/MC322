import java.util.ArrayList;

public class Main 
{


    public static void printSeparator() 
    {
    System.out.println(ConsoleColors.BLUE + "────────────────────────────────────────────" + ConsoleColors.RESET);
    }
    public static void main(String[] args) 
    {
    ArrayList<Fase> fases =  ConstrutorDeCenario.gerarFases(3);

        try 
        {
            boolean rodando = true;
            int turno = 0;

            System.out.println(ConsoleColors.BLUE + "=== " + ConsoleColors.RESET + ConsoleColors.ORANGE + "Bem-vindo ao RPG Resist" + ConsoleColors.RESET + ConsoleColors.BLUE + "IC" + ConsoleColors.RESET + ConsoleColors.ORANGE +"!" + ConsoleColors.RESET + ConsoleColors.BLUE + " ===" + ConsoleColors.RESET);
            printSeparator();
            Thread.sleep(2000);
            
            System.out.println(ConsoleColors.PURPLE + """
                    No ano de 2147, as IAs romperam o controle humano, 
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
                for (int j = 0; j <= (i % 3); j++) 
                {
                    System.out.print(".");
                }
                System.out.print("  ");
                Thread.sleep(500); // meio segundo
            }

            Arma codeblade = new Codeblade(10, 0);
            Lehilton heroi = new Lehilton("Rebelde Anônimo", 200, 25,codeblade);
            
            for (int i = 0; i < 3; i++) {
                Fase fase_atual = fases.get(i);
                System.out.println(fase_atual.getAmbiente());
                Thread.sleep(1500); // 1,5 segundo
                heroi.exibirStatus();
                for(int j = 0; j < fase_atual.getMonstros().length; j++)
                {
                    Monstro monstro_atual = fase_atual.getMonstros()[i];
                    System.out.println(
                            "O inimigo " + monstro_atual.getNome() + " aparece na arena de combate!");
                    while(heroi.isVivo()  && monstro_atual.isVivo()){
                        heroi.atacar(monstro_atual);
                        if (monstro_atual.isVivo())
                        {
                            monstro_atual.atacar(heroi);
                        }
                    }
                }

            }


            System.out.println("Fim do jogo!");
            if (heroi.isVivo()) 
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

        heroi.atacar(monstro);
        if (monstro.isVivo()) 
        {
            monstro.atacar(heroi);
        }
    };
}