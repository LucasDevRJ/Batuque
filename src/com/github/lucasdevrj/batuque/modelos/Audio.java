package com.github.lucasdevrj.batuque.modelos;

public class Audio {

    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public void curtir() {
        System.out.println("Você curtiu " + titulo + " com sucesso.");
    }

    public void reproduzir() {
        System.out.println("Reproduzindo " + titulo + ".");
    }

}
