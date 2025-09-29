package ResistIC.Logica;

import java.util.ArrayList;

import ResistIC.Personagens.Herois.*;
import ResistIC.Personagens.Monstros.Monstro;

public class GameManager {

    public void iniciar() {
        try {

            ConstrutorDeCenarioFixo gerador_de_fases = new ConstrutorDeCenarioFixo();
            int quantidade_de_fases = InputManager.lerInteiro("Quantas fases quer jogar? (1,2 ou 3) -->", 1, 3);
            System.out.println();
            int dificuldade = InputManager
                    .lerInteiro("Selecione a dificuldade. Digite \n1: FÁCIL\n2: NORMAL\n3: DIFÍCIL\nE dê ENTER -->", 1,
                            3);
            Dificuldade dificuldade_de_jogo;
            switch (dificuldade) {
                case 1:
                    dificuldade_de_jogo = Dificuldade.FACIL;
                    break;
                case 2:
                    dificuldade_de_jogo = Dificuldade.NORMAL;
                    break;
                case 3:
                    dificuldade_de_jogo = Dificuldade.DIFICIL;
                    break;
                default:
                    dificuldade_de_jogo = Dificuldade.NORMAL;
            }
            System.out.println();


            String nome_do_jogador;
            do
            {
                nome_do_jogador = InputManager.lerString("Digite o nome do seu personagem: ");
                if (nome_do_jogador == "") {
                    System.out.println(
                            "O nome não pode ser vazio! Você deve escolher um nome válido para seu personagem!");
                }
            }
            while (nome_do_jogador == "");


            String string_heroi;
            do {
                string_heroi = InputManager.lerString("Qual herói você deseja escolher? (Lehilton/Marcelo) -->").trim();

                if (!string_heroi.equalsIgnoreCase("Lehilton") && !string_heroi.equalsIgnoreCase("Marcelo")) {
                    System.out.println("Você deve escolher somente Lehilton ou Marcelo.");
                }
            } while (!string_heroi.equalsIgnoreCase("Lehilton") && !string_heroi.equalsIgnoreCase("Marcelo"));



            
            if (string_heroi == "Lehilton".toLowerCase()){}
            Heroi heroi = new Lehilton(nome_do_jogador, dificuldade_de_jogo.getVariacaoSorteHeroi());
            switch (string_heroi) {
                case "Lehilton":
                case "lehilton":
                    heroi = new Lehilton(nome_do_jogador, dificuldade_de_jogo.getVariacaoSorteHeroi());
                    break;
                case "Marcelo":
                case "marcelo":
                    heroi = new Marcelo(nome_do_jogador, dificuldade_de_jogo.getVariacaoSorteHeroi());
                    break;
            }

            ArrayList<FaseDeCombate> fases = gerador_de_fases.gerar(quantidade_de_fases, dificuldade_de_jogo);

            for (int i = 0; i < 15; i++) {
                System.out.print("\r" + "Carregando jogo");
                for (int j = 0; j <= (i % 3); j++) {
                    System.out.print(".");
                }
                System.out.print("  ");
                Thread.sleep(500); // meio segundo
            }
            System.out.println();
            System.out.println();



            // Laço de repetição principal
            for (int i = 0; i < fases.size(); i++) {
                FaseDeCombate fase_atual = fases.get(i);

                // Iniciando a fase. OBS: o método getTipoCenario é chamado dentro de
                // "iniciar(heroi)"
                fase_atual.iniciar(heroi);

                // Laço de combate para cada monstro da fase
                if (heroi.estaVivo()) {
                    Monstro monstro_atual = fase_atual.getMonstro();
                    System.out.println("O inimigo " + monstro_atual.getNome() + " aparece na arena de combate!");

                    // Laço while para verificar se os combatentes estão vivos
                    while (heroi.estaVivo() && monstro_atual.estaVivo()) {
                        heroi.escolherAcao(monstro_atual).executar(heroi, monstro_atual);

                        if (monstro_atual.estaVivo()) {
                            monstro_atual.escolherAcao(heroi).executar(monstro_atual, heroi);
                        }

                        else {
                            heroi.definir_sorte();
                            if (heroi.getSorte() >= 0.75) {
                                heroi.equiparArma(Monstro.largaArma());
                            }
                        }
                    }
                }
            }
            System.out.println("\n");
            System.out.println("\n");

            System.out.println("Fim do jogo!");
            if (heroi.estaVivo()) {
                System.out.println("Parabens, você conseguiu salvar nossa comunidade!");
            } else {
                System.out.println("Você Falhou na Missão, e todo o IC foi dominado pelas máquinas...");
            }
        } catch (

        InterruptedException e) {
            e.printStackTrace();
        }
    }

}
