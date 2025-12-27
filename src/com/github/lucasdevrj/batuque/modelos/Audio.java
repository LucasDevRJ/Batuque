package com.github.lucasdevrj.batuque.modelos;

public class Audio {

    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;
    private boolean estaReproduzindo;
    private boolean foiCurtido;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
            System.out.println("O \"" + titulo + "\" não está sendo reproduzido.");
        }
    }

}
