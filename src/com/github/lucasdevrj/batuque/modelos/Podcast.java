package com.github.lucasdevrj.batuque.modelos;

import com.github.lucasdevrj.batuque.classificacao.Classificavel;

public class Podcast extends Audio implements Classificavel {

    private String apresentador;
    private double velocidadeDeReproducao = 1.0;

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public double getVelocidadeDeReproducao() {
        return velocidadeDeReproducao;
    }

    public void aumentarVelocidadeDeReproducao() {
       if (velocidadeDeReproducao < 3.0) {
           velocidadeDeReproducao += 0.5;
           System.out.println("Você está escutando o Podcast " + getTitulo() + " na velocidade de reprodução " + getVelocidadeDeReproducao() + "x.");
       } else {
           System.out.println("Você já atingiu a velocidade máxima permitida.");
       }
    }

    public void diminuirVelocidadeDeReproducao() {
        if (velocidadeDeReproducao > 0.5) {
            velocidadeDeReproducao -= 0.5;
            System.out.println("Você está escutando o Podcast " + getTitulo() + " na velocidade de reprodução " + getVelocidadeDeReproducao() + "x.");
        } else {
            System.out.println("Você já atingiu a velocidade mínima permitida.");
        }
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
