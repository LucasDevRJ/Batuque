package com.github.lucasdevrj.batuque.modelos;

import com.github.lucasdevrj.batuque.classificacao.Classificavel;

public class Podcast extends Audio implements Classificavel {

    private String apresentador;

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public int classifica(Audio audio) {
        if (audio.getTotalDeReproducoes() >= 5) {
            return 1;
        } else if (audio.getTotalDeReproducoes() >= 3) {
            return 2;
        } else if (audio.getTotalDeReproducoes() >= 2) {
            return 3;
        }
        return -1;
    }

    @Override
    public void exibeClassificacao(Audio audio) {
        int classificacao = classifica(audio);
        switch (classificacao) {
            case 1:
                System.out.println("O Podcast " + audio.getTitulo() + " ficou em primeiro lugar! É o mais escutado no momento.");
                break;
            case 2:
                System.out.println("O Podcast " + audio.getTitulo() + " ficou em segundo lugar! É um dos mais escutados no momento.");
                break;
            case 3:
                System.out.println("O Podcast" + audio.getTitulo() + " ficou em terceiro lugar! É um dos mais escutados no momento.");
                break;
            default:
                System.out.println("O Podcast" + audio.getTitulo() + " não está no TOP 3.");
        }
    }
}
