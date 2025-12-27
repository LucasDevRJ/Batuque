package com.github.lucasdevrj.batuque.principal;

import com.github.lucasdevrj.batuque.modelos.Audio;
import com.github.lucasdevrj.batuque.modelos.Musica;
import com.github.lucasdevrj.batuque.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Audio audio = new Audio();

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
        audio.adiciona(musica);
        audio.adiciona(musica);
        audio.exibeTempoTotalDeReproducoes();
        musica.exibeInformacoes();
        musica.classifica(musica);
        musica.exibeClassificacao(musica);

        Podcast podcast = new Podcast();
        podcast.setApresentador("Paulo Silveira");
        podcast.setTitulo("Livros de Tecnologia que amamos - Hipsters Ponto Tech");
        podcast.setDuracao(45);
        podcast.reproduzir();
        audio.adiciona(podcast);
        audio.adiciona(podcast);
        audio.exibeTempoTotalDeReproducoes();
    }
}
