package ResistIC.Personagens.Herois;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Personagens.Personagem;
import ResistIC.Suporte.ConsoleColors;
import ResistIC.itens.Armas.Arma;

public abstract class Heroi extends Personagem {

    private int nivel;
    private int experiencia;
    private int pontos_para_proximo_nivel;
    private double sorte;
    private double variacao_sorte_heroi;
    private List<AcaoDeCombate> acoes;

    public Heroi(String nome, int vida, int forca, Arma arma, double variacao_sorte_heroi) {
        super(nome,  200,  100, arma);
        this.nivel = 1;
        this.experiencia = 0;
        this.pontos_para_proximo_nivel = 100;
        this.acoes = new ArrayList<>();
        this.variacao_sorte_heroi = variacao_sorte_heroi;

    }

    public List<AcaoDeCombate> getAcoes() {
        return acoes;
    }

    public void addAcao(AcaoDeCombate acao) {
        this.acoes.add(acao);
    }

    public double getSorte() {
        return sorte;
    }

    public void ganharExperiencia(int xpconcedido) {
        this.experiencia += xpconcedido;
        if (experiencia >= pontos_para_proximo_nivel) {
            // O nível do Herói é incrementado em 1 sempre que a experiencia atinge 100
            experiencia = experiencia % pontos_para_proximo_nivel;
            this.subirDeNivel();
        }

    }

    public void equiparArma(Arma novaArma) {
        if (this.nivel < novaArma.getminNivel()) {
            System.out.println("O Herói não possui nível suficiente para equipar essa arma!");
        } else {
            this.setArma(novaArma);
            System.out.printf("A arma %s foi equipada!", novaArma.getClass().getSimpleName());
        }
    }

    private void subirDeNivel() {
        this.nivel += 1;
        this.pontosDeVida += 10;
        this.forca += 10;
        this.pontos_para_proximo_nivel += 100;
    }

    // Método para definir a sorte do herói
    Random gerador = new Random();

    public void definir_sorte() {
        this.sorte = gerador.nextDouble() + variacao_sorte_heroi;
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();

        System.out.println(
                "⭐ Nível: " + ConsoleColors.PURPLE + nivel + ConsoleColors.RESET);
        System.out.println(
                "📊 Experiência: " + ConsoleColors.CYAN + experiencia + ConsoleColors.RESET);
        System.out
                .println(ConsoleColors.BLUE + "===============================================" + ConsoleColors.RESET);

    }

}
