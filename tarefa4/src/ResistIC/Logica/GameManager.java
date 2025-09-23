package ResistIC.Logica;

import java.util.ArrayList;

import ResistIC.Personagens.Herois.Heroi;
import ResistIC.Personagens.Herois.Lehilton;
import ResistIC.Personagens.Monstros.Monstro;
import ResistIC.itens.Armas.Arma;
import ResistIC.itens.Armas.Codeblade;

public class GameManager {

    public void iniciar() {
        try {

            ConstrutorDeCenarioFixo gerador_de_fases = new ConstrutorDeCenarioFixo();
            ArrayList<FaseDeCombate> fases = gerador_de_fases.gerar(3);

            for (int i = 0; i < 15; i++) {
                System.out.print("\r" + "Carregando jogo");
                for (int j = 0; j <= (i % 3); j++) {
                    System.out.print(".");
                }
                System.out.print("  ");
                Thread.sleep(500); // meio segundo
            }

            Arma codeblade = new Codeblade(10, 0);
            Lehilton heroi = new Lehilton("Rebelde Anônimo", 200, 25, codeblade);

            // Laço de repetição principal
            for (int i = 0; i < fases.size(); i++) {
                FaseDeCombate fase_atual = fases.get(i);

                // Iniciando a fase. OBS: o método getTipoCenario é chamado dentro de
                // "iniciar(heroi)"
                fase_atual.iniciar(heroi);

                // Laço de combate para cada monstro da fase
                for (int j = 0; j < fase_atual.getMonstros().length; j++) {
                    if (heroi.estaVivo()) {
                        Monstro monstro_atual = fase_atual.getMonstros()[j];
                        System.out.println(
                                "O inimigo " + monstro_atual.getNome() + " aparece na arena de combate!");

                        // Laço while para verificar se os combatentes estão vivos
                        while (heroi.estaVivo() && monstro_atual.estaVivo()) {
                            heroi.escolherAcao(monstro_atual).executar(heroi, monstro_atual);
                            ;

                            if (monstro_atual.estaVivo()) {
                                monstro_atual.escolherAcao(heroi).executar(monstro_atual, heroi);
                                ;
                            } else {
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
            }

            System.out.println("Fim do jogo!");
            if (heroi.estaVivo()) {
                System.out.println("Parabens, você conseguiu salvar nossa comunidade!");
            } else {
                System.out.println("Você Falhou na Missão, e todo o IC foi dominado pelas máquinas...");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void atualizar(int turno, Heroi heroi, Monstro monstro) {
        // Atualizar personagens , checar eventos, etc

        heroi.escolherAcao(monstro);
        if (monstro.estaVivo()) {
            monstro.escolherAcao(heroi);
        }
    }
};