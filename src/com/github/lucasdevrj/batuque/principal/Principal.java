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

        Musica musica2 = new Musica();
        musica2.setTitulo("Señorita");
        musica2.setArtista("Shawn Mendes, Camila Cabello");
        musica2.setDuracao(3);
        musica2.reproduzir();
        musica2.encerrar();
        musica2.reproduzir();
        musica2.encerrar();
        musica2.reproduzir();
        musica2.adiciona(musica2);
        musica2.adiciona(musica2);
        musica2.adiciona(musica2);
        musica2.adiciona(musica2);

        musica2.curtir();
        musica2.curtir();
        musica2.curtir();
        musica2.curtir();
        musica2.classifica(musica2);
        musica2.exibeClassificacao(musica2);
        musica2.exibirInformacoesGerais();
        System.out.println("Total de reproduções = " + musica2.getTotalDeReproducoes());
        musica2.exibeTempoTotalDeReproducoes();

        Podcast podcast = new Podcast();
        podcast.setApresentador("Paulo Silveira");
        podcast.setTitulo("Livros de Tecnologia que amamos - Hipsters Ponto Tech");
        podcast.setDuracao(45);
        podcast.reproduzir();
        audio.adiciona(podcast);
        audio.adiciona(podcast);
        audio.exibeTempoTotalDeReproducoes();
        podcast.aumentarVelocidadeDeReproducao();
        podcast.aumentarVelocidadeDeReproducao();
        podcast.aumentarVelocidadeDeReproducao();
        podcast.aumentarVelocidadeDeReproducao();
        podcast.aumentarVelocidadeDeReproducao();
        podcast.diminuirVelocidadeDeReproducao();
        podcast.diminuirVelocidadeDeReproducao();
        podcast.diminuirVelocidadeDeReproducao();
        podcast.diminuirVelocidadeDeReproducao();
        podcast.diminuirVelocidadeDeReproducao();
        podcast.diminuirVelocidadeDeReproducao();

        podcast.exibeClassificacao(podcast);
    }
}
