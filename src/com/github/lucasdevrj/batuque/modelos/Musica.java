package com.github.lucasdevrj.batuque.modelos;

import com.github.lucasdevrj.batuque.calculos.Classificavel;

public class Musica extends Audio implements Classificavel {

    private String artista;

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void exibeInformacoes() {
        System.out.println("--------------------|Informações sobre a Música|--------------------");
        System.out.println("Música: " + super.getTitulo());
        System.out.println("Duração: " + super.getDuracao() + " minutos");
        System.out.println("Artista: " + artista);
        System.out.println("--------------------------------------------------------------------");
    }

    @Override
    public int classifica(Audio audio) {
        if (audio.getCurtidas() >= 5) {
            return 1;
        } else if (audio.getCurtidas() >= 3) {
            return 2;
        } else if (audio.getCurtidas() >= 2) {
            return 3;
        }
        return -1;
    }

    @Override
    public void exibeClassificacao(Audio audio) {
        int classificacao = classifica(audio);
        switch (classificacao) {
            case 1:
                System.out.println("O " + audio.getTitulo() + " ficou em primeiro lugar! É o mais escutado no momento.");
                break;
            case 2:
                System.out.println("O " + audio.getTitulo() + " ficou em segundo lugar! É um dos mais escutados no momento.");
                break;
            case 3:
                System.out.println("O " + audio.getTitulo() + " ficou em terceiro lugar! É um dos mais escutados no momento.");
                break;
            default:
                System.out.println("O " + audio.getTitulo() + " não está no TOP 3.");
        }
    }
}
