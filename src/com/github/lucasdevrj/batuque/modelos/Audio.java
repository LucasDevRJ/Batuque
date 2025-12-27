package com.github.lucasdevrj.batuque.modelos;

public class Audio {

    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;
    private boolean estaReproduzindo;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void curtir() {
        System.out.println("Você curtiu \"" + titulo + "\" com sucesso.");
    }

    public void reproduzir() {
        if (!estaReproduzindo) {
            System.out.println("Reproduzindo \"" + titulo + "\".");
            estaReproduzindo = true;
        } else {
            System.out.println("O " + titulo + " já esta sendo reproduzido.");
        }
    }

}
