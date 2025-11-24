package ResistIC.Logica;

import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.bind.annotation.*;

import ResistIC.Personagens.Herois.*;
import ResistIC.Personagens.Monstros.Monstro;
import ResistIC.Suporte.ConsoleColors;

@XmlRootElement(name = "batalha")
/**
 * Gerencia o fluxo principal do jogo.
 *
 * A classe {@code GameManager} é responsável por:
 *
 * <ul>
 * <li>Inicializar o jogo, solicitando informações do jogador (nome, herói e
 * dificuldade).</li>
 * <li>Gerar as fases de combate através de
 * {@link ConstrutorDeCenarioFixo}.</li>
 * <li>Controlar o loop de jogo, incluindo combate entre herói e monstros.</li>
 * <li>Gerenciar interações pós-turno, como loot, status do personagem e
 * desistência.</li>
 * <li>Exibir mensagens de vitória ou derrota ao final do jogo.</li>
 * </ul>
 *
 * <p>
 * O método {@link #iniciar()} encapsula toda a lógica de execução do jogo,
 * desde a seleção de opções até o combate final.
 * </p>
 *
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-12
 */
public class Batalha {

    private int quantidade_de_fases;
    private int dificuldade;
    private String nome_do_jogador;
    private String string_heroi;
    private Heroi heroi;
    private ArrayList<FaseDeCombate> fases;
    private int numero_fase_atual;
    private Dificuldade dificuldade_de_jogo;

    /** Construtor sem argumentos */
    public Batalha() {}

    /**Construtor com argumentos */
    public Batalha(int quantidade_de_fases, int dificuldade, String nome_do_jogador, String string_heroi) {
        this.quantidade_de_fases = quantidade_de_fases;
        this.dificuldade = dificuldade;
        this.nome_do_jogador = nome_do_jogador;
        this.string_heroi = string_heroi;
        this.dificuldade_de_jogo = definir_dificuldade(this.dificuldade);
        this.heroi = criar_heroi(this.string_heroi);
        this.fases = geradorFases(quantidade_de_fases, dificuldade_de_jogo);
        this.numero_fase_atual = 0; 

    }

    //Getters s Setters com anotações para o JAXB conseguir ler e reconstruir o objeto
    @XmlElement
    public int getQuantidade_de_fases() { return quantidade_de_fases; }
    public void setQuantidade_de_fases(int q) { this.quantidade_de_fases = q; }

    @XmlElement
    public int getDificuldade() { return dificuldade; }
    public void setDificuldade(int d) { this.dificuldade = d; }

    @XmlElement
    public String getNome_do_jogador() { return nome_do_jogador; }
    public void setNome_do_jogador(String n) { this.nome_do_jogador = n; }

    @XmlElement
    public String getString_heroi() { return string_heroi; }
    public void setString_heroi(String s) { this.string_heroi = s; }

    @XmlElement
    public Heroi getHeroi() { return heroi; }
    public void setHeroi(Heroi h) { this.heroi = h; }

    @XmlElementWrapper(name = "fases")
    @XmlElement(name = "fase")
    public ArrayList<FaseDeCombate> getFases() { return fases; }
    public void setFases(ArrayList<FaseDeCombate> f) { this.fases = f; }

    @XmlElement
    public int getNumero_fase_atual() { return numero_fase_atual; }
    public void setNumero_fase_atual(int n) { this.numero_fase_atual = n; }

    @XmlElement
    public Dificuldade getDificuldade_de_jogo() { return dificuldade_de_jogo; }
    public void setDificuldade_de_jogo(Dificuldade d) { this.dificuldade_de_jogo = d; }

    //Método para definir o ENUM de dificuldade do Jogo
    private Dificuldade definir_dificuldade(int dificuldade) {
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
        return dificuldade_de_jogo;
    }
    
    //Método para criar o objeto Herói a partir da string de herói fornecida pelo jogador
    private Heroi criar_heroi(String string_heroi) {
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
        return heroi;
    }
    
    //Método para criar vetor de fases que o jogador irá percorrer ao longo de sua jornada
    private ArrayList<FaseDeCombate> geradorFases(int quantidade_de_fases, Dificuldade dificuldade_de_jogo) {
        ConstrutorDeCenarioFixo gerador_de_fases = new ConstrutorDeCenarioFixo();
        ArrayList<FaseDeCombate> fases = gerador_de_fases.gerar(quantidade_de_fases, dificuldade_de_jogo);
        return fases;
    }

    public static Batalha carregarJogo(String nomeSave) {
        
        Batalha jogoCarregado = GerenciadorDePersistencia.carregarBatalha(nomeSave);

        if (jogoCarregado != null) {
            System.out.println("Seu jogo foi salvo com sucesso!");
        }

        return jogoCarregado;
    }
                

    /**
     * Inicia o jogo.
     */
    public void executar() {
        try {

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
            for (int i = numero_fase_atual; i < fases.size(); i++) {
                FaseDeCombate fase_atual = fases.get(i);

                // Iniciando a fase. OBS: o método getTipoCenario é chamado dentro de
                // "iniciar(heroi)"

                if (heroi.estaVivo()) {
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
                                if (i == fases.size() - 1) {
                                    break;
                                }
                                // Menu Pós-Turno
                                else {
                                    System.out.println(
                                            ConsoleColors.ORANGE + "[1]" + ConsoleColors.RESET + " Interagir com Loot");
                                    System.out.println(ConsoleColors.ORANGE + "[2]" + ConsoleColors.RESET
                                            + " Ver Informações do Personagem");
                                    System.out.println(
                                            ConsoleColors.ORANGE + "[3]" + ConsoleColors.RESET + " Desistir do Jogo");
                                    System.out.println(
                                            ConsoleColors.ORANGE + "[4]" + ConsoleColors.RESET + " Seguir Adiante");
                                    System.out.println(
                                            ConsoleColors.ORANGE + "[5]" + ConsoleColors.RESET + "Salvar e voltar ao menu inicial");
                                    
                                }

                                boolean rodando = true;

                                while (rodando) {
                                    int instancia = InputManager.lerInteiro("Digite sua Opção> ", 1, 5);
                                    System.out.println();

                                    // Interagir com LOOT
                                    if (instancia == 1) {
                                        heroi.definir_sorte();
                                        if (heroi.getSorte() >= 0.75) {
                                            heroi.equiparArma(Monstro.largaArma());
                                        }
                                    }

                                    // Ver informações do personagem
                                    else if (instancia == 2) {
                                        heroi.exibirStatus();
                                    }
                                    // Desistir do jogo
                                    else if (instancia == 3) {
                                        rodando = false;
                                        heroi.receberDano(heroi.getVida());
                                        MenuPrincipal novoMenuPrincipal = new MenuPrincipal();
                                        novoMenuPrincipal.exibirmenu();
                                    }
                                    //Seguir adiante para a próxima fase
                                    else if (instancia == 4) {
                                        rodando = false;
                                    }
                            
                                    //PlaceHolder para salvar e voltar ao menu inicial
                                    else if (instancia == 5) {
                                        //PlaceHolder para salvar o estado do jogo
                                        this.numero_fase_atual = i + 1;
                                        System.out.print("Digite o nome para o save: ");
                                        Scanner scannerSave = new Scanner(System.in);
                                        String nomeSave = scannerSave.nextLine();
                                        GerenciadorDePersistencia.salvarBatalha(this, nomeSave);
                                        rodando = false;
                                        MenuPrincipal novoMenuPrincipal = new MenuPrincipal();
                                        novoMenuPrincipal.exibirmenu();

                                        return;
                                    }
                                    
                                }

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
                MenuPrincipal novoMenuPrincipal = new MenuPrincipal();
                novoMenuPrincipal.exibirmenu();
            }
        } catch (

        InterruptedException e) {
            e.printStackTrace();
        }
    }

}
