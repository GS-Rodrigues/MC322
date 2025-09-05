public class Main 
{


    public static void printSeparator() 
    {
    System.out.println(ConsoleColors.BLUE + "────────────────────────────────────────────" + ConsoleColors.RESET);
    }
    public static void main(String[] args) 
    {
        Monstro[] monstros = new Monstro[3];
        monstros[0] = new Enxame_Dados("QLS", 150, 15);
        monstros[1] = new Corrupted_IA("ChatQPG", 120, 5);
        monstros[2] = new Corrupted_IA("Geminy", 180, 20);

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

            Lehilton heroi = new Lehilton("Rebelde Anônimo", 200, 25);
            
            while (rodando) {
                // Atualiza lógica do jogo
                if (turno < 3 && (turno == 0 || !monstros[turno-1].isVivo())) 
                {
                turno++;
                System.out.println("\n═══════════════ 🎲 TURNO " + turno + " 🎲 ═══════════════");
                System.out.println(ConsoleColors.ORANGE + "👾 Um monstro se esgueira pelo Campus!" + ConsoleColors.RESET);
                monstros[turno-1].exibirStatus();
                heroi.exibirStatus();
                }

                // apenas 3 turnos
                if (turno == 3 && (!monstros[turno-1].isVivo() || !heroi.isVivo())) 
                {
                    rodando = false;
                    break;
                }
                atualizar(turno, heroi, monstros[turno-1]);
                
                Thread.sleep(300); // 2 segundos delay
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