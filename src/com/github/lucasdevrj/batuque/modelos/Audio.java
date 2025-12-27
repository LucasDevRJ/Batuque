package com.github.lucasdevrj.batuque.modelos;

import com.github.lucasdevrj.batuque.calculos.CalculadoraDeTempo;

public class Audio implements CalculadoraDeTempo {

    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;
    private boolean estaReproduzindo;
    private boolean foiCurtido;
    private int tempoTotalReproduzido;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void curtir() {
        if (!foiCurtido) {
            System.out.println("Você curtiu \"" + titulo + "\" com sucesso.");
            foiCurtido = true;
            curtidas++;
        } else {
            System.out.println("Você já curtiu o \"" + titulo + "\".");
        }
    }

    public void reproduzir() {
        if (!estaReproduzindo) {
            System.out.println("Reproduzindo \"" + titulo + "\".");
            totalDeReproducoes++;
            estaReproduzindo = true;
        } else {
            System.out.println("O \"" + titulo + "\" já esta sendo reproduzido.");
        }
    }

    public void pausar() {
        if (estaReproduzindo) {
            System.out.println("Você pausou o \"" + titulo + "\".");
            estaReproduzindo = false;
        } else {
            System.out.println("O \"" + titulo + "\" não está sendo reproduzido, por isso não é possível pausa-lo.");
        }
    }

    public void encerrar() {
        if (estaReproduzindo) {
            System.out.println("Você encerrou o \"" + titulo + "\".");
            estaReproduzindo = false;
        } else {
            System.out.println("O \"" + titulo + "\" não está sendo reproduzido, por isso não é possível encerra-lo.");
        }
    }

    @Override
    public int adiciona(Audio audio) {
        System.out.println("Você adicionou o \"" + titulo + "\" ao tempo total de reprodução.");
        return tempoTotalReproduzido += audio.getDuracao();
    }

    @Override
    public void exibeTempoTotalDeReproducoes() {
        System.out.printf("Você reproduziu %d minutos no total.", tempoTotalReproduzido);
    }
}
