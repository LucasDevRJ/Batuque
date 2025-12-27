package com.github.lucasdevrj.batuque.modelos;

public class Musica extends Audio {

    private Artista artista;

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void exibeInformacoes() {
        System.out.println("--------------------|Informações sobre a Música|--------------------");
        System.out.println("Música: " + super.getTitulo());
        System.out.println("Duração: " + super.getDuracao() + " minutos");
        System.out.println("Artista: " + artista.getNome());
        System.out.println("--------------------------------------------------------------------");
    }
}
