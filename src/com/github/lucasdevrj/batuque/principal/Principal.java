package com.github.lucasdevrj.batuque.principal;

import com.github.lucasdevrj.batuque.modelos.Musica;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("I Gotta Feeling");
        musica.setArtista("Black Eyed Peas");
        musica.setDuracao(4);
        musica.reproduzir();
        musica.reproduzir();
        musica.curtir();
        musica.curtir();
        musica.curtir();
        musica.pausar();
        musica.pausar();
        musica.reproduzir();
        musica.encerrar();
        musica.encerrar();
        musica.reproduzir();
        musica.adiciona(musica);
        musica.adiciona(musica);
        musica.exibeTempoTotalDeReproducoes();
        musica.exibeInformacoes();
        musica.classifica(musica);
        musica.exibeClassificacao(musica);
    }
}
