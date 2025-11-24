package ResistIC.Personagens.Herois;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.xml.bind.annotation.*;

import ResistIC.Interfaces.AcaoDeCombate;
import ResistIC.Personagens.Personagem;
import ResistIC.Suporte.ConsoleColors;
import ResistIC.itens.Armas.Arma;

/**
 * Representa um herói controlável pelo jogador.
 * 
 * <p>
 * Um {@code Heroi} é uma especialização de {@code Personagem} com atributos de
 * progressão
 * como nível, experiência e sorte, além de possuir uma lista de ações de
 * combate.
 * </p>
 * 
 * @author Guilherme e Giovani
 * @version 1.0
 * @since 2025-10-08
 */

@XmlRootElement
@XmlSeeAlso({Lehilton.class, Marcelo.class})
public abstract class Heroi extends Personagem {

    private int nivel;
    private int experiencia;
    private int pontos_para_proximo_nivel;
    private double sorte;
    private double variacao_sorte_heroi;
    private List<AcaoDeCombate> acoes;
    private Random gerador ;

    /**
     * Cria um herói com atributos iniciais padrão.
     *
     * @param nome                 nome do herói
     * @param arma                 arma equipada inicialmente
     * @param variacao_sorte_heroi fator de variação aplicado ao cálculo da sorte
     */


    public Heroi() {
        super(); 
        this.acoes = new ArrayList<>();
        this.gerador = new Random();
    }
    public Heroi(String nome, Arma arma, double variacao_sorte_heroi) {
        super(nome, 200, 100, arma);
        this.nivel = 1;
        this.experiencia = 0;
        this.pontos_para_proximo_nivel = 100;
        this.acoes = new ArrayList<>();
        this.variacao_sorte_heroi = variacao_sorte_heroi;
        this.gerador = new Random();

    }

    //Getters e Setters com tags para o JAXB
    @XmlElement 
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @XmlElement
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @XmlElement(name = "pontosProximoNivel") 
    public int getPontos_para_proximo_nivel() {
        return pontos_para_proximo_nivel;
    }
    public void setPontos_para_proximo_nivel(int pontos) {
        this.pontos_para_proximo_nivel = pontos;
    }

    @XmlElement
    public double getSorte() {
        return sorte;
    }
    public void setSorte(double sorte) {
        this.sorte = sorte;
    }

    @XmlElement
    public double getVariacao_sorte_heroi() {
        return variacao_sorte_heroi;
    }
    public void setVariacao_sorte_heroi(double variacao) {
        this.variacao_sorte_heroi = variacao;
    }

    
    @XmlTransient
    public List<AcaoDeCombate> getAcoes() {
        return acoes;
    }
    public void setAcoes(List<AcaoDeCombate> acoes) {
        this.acoes = acoes;
    }

    public void addAcao(AcaoDeCombate acao) {
        this.acoes.add(acao);
    }

    
    @XmlTransient 
    public Random getGerador() {
        return gerador;
    }
    public void setGerador(Random gerador) {
        this.gerador = gerador;
    }

    /**
     * Incrementa a experiência do herói. Quando a experiência total
     * atinge os {@code pontos_para_proximo_nivel}, o herói sobe de nível.
     *
     * @param xpconcedido quantidade de experiência recebida
     */
    public void ganharExperiencia(int xpconcedido) {
        this.experiencia += xpconcedido;
        if (experiencia >= pontos_para_proximo_nivel) {
            // O nível do Herói é incrementado em 1 sempre que a experiencia atinge 100
            experiencia = experiencia % pontos_para_proximo_nivel;
            this.subirDeNivel();
        }

    }

    /**
     * Equipa uma arma ao heroi
     *
     * @param novaArma arma a ser equipada pelo heroi
     */
    public void equiparArma(Arma novaArma) {
        if (this.nivel < novaArma.getminNivel()) {
            System.out.println("O Herói não possui nível suficiente para equipar essa arma!");
        } else {
            this.setArma(novaArma);
            System.out.printf("A arma %s foi equipada!", novaArma.getClass().getSimpleName());
        }
    }

    /**
     * Aumenta os niveis e atributos do heroi
     *
     */
    private void subirDeNivel() {
        this.nivel += 1;
        this.pontosDeVida += 10;
        this.forca += 10;
        this.pontos_para_proximo_nivel += 100;
    }

    /**
     * Define a sorte do herói de forma aleatória,
     * considerando o fator de variação {@code bariação_sorte_heroi}.
     */
    public void definir_sorte() {
        this.sorte = gerador.nextDouble() + variacao_sorte_heroi;
    }

    /**
     * Exibe os status atuais do herói.
     * Inclui informações de nível e experiência, além dos status básicos herdados.
     */
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
