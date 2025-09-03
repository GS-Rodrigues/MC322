
public class Main 
{
        public static final String ORANGE = "\u001B[38;5;208m";
        public static final String BLUE = "\u001B[34m";
        public static final String RESET = "\u001B[0m";

    public static void main(String[] args) 
    {
        Monstro[] monstros = new Monstro[3];
        monstros[0] = new Enxame_Dados("QLS&#", 150, 15);
        monstros[1] = new Corrupted_IA("ChatQPG$#@", 120, 5);
        monstros[1] = new Corrupted_IA("$5Geminy8", 180, 20);

        try 
        {
            boolean rodando = true;
            int turno = 1;

            System.out.println(BLUE + "=== " + RESET + ORANGE + "Bem-vindo ao RPG Resist" + RESET + BLUE + "IC" + RESET + ORANGE +"!" + RESET + BLUE + " ===" + RESET);
            Thread.sleep(2000);
            
            System.out.println("No ano de " + BLUE + "2147" + RESET + ", as " + ORANGE + "IAs" + RESET +" romperam o " + BLUE + "controle humano" + RESET + ", dominaram governos e exércitos e aprenderam até a manipular emoções.\n" +
            "Restou à " + BLUE + "humanidade" + RESET + " refugiar-se no " + BLUE + "Instituto de Computação" + RESET + ", última fortaleza da " + ORANGE + "resistência" + RESET +".\n" +
            "Agora, antigos professores se tornaram " + ORANGE + "Rebeldes" + RESET +", preparados para enfrentar as " + ORANGE + "máquinas" + RESET +" numa " + ORANGE + "batalha" + RESET +" que decidirá o " + BLUE + "futuro" + RESET + " da espécie humana.");
            
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
            
            System.out.print("\r" + "==================="); 

            while (rodando) {
                System.out.println("\n--- Turno " + turno + " ---");
                // Atualiza lógica do jogo
                atualizar(turno, monstros);

                // apenas 3 turnos
                if (turno >= 3) 
                {
                    rodando = false;
                }

                turno++;
                Thread.sleep(3000); // 2 segundos delay

            }

            System.out.println("Fim do jogo!");
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }

    static void atualizar(int turno, Monstro[] monstros) {
        // Atualizar personagens , checar eventos, etc
        System.out.println("Atualizando lógica do jogo...");
        monstros[0].exibirStatus();

    }

    static void renderizar() {
        // Mostrar informações na tela
        System.out.println("Renderizando mundo do jogo...");
    }
}
