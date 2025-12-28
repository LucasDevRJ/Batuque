package com.github.lucasdevrj.batuque.principal;

import com.github.lucasdevrj.batuque.calculos.CalculadoraDeTempo;
import com.github.lucasdevrj.batuque.modelos.Musica;
import com.github.lucasdevrj.batuque.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();

        Musica musica = new Musica();
        musica.setTitulo("I Gotta Feeling");
        musica.setArtista("Black Eyed Peas");
        musica.setCalculadoraDeTempo(calculadoraDeTempo);
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
        calculadoraDeTempo.adiciona(musica);
        calculadoraDeTempo.adiciona(musica);
        calculadoraDeTempo.exibeTempoTotalDeReproducoes();
        musica.exibeInformacoes();
        musica.classifica(musica);
        musica.exibeClassificacao(musica);

        Musica musica2 = new Musica();
        musica2.setTitulo("Señorita");
        musica2.setArtista("Shawn Mendes, Camila Cabello");
        musica2.setCalculadoraDeTempo(calculadoraDeTempo);
        musica2.setDuracao(3);
        musica2.reproduzir();
        musica2.encerrar();
        musica2.reproduzir();
        musica2.encerrar();
        calculadoraDeTempo.adiciona(musica2);
        calculadoraDeTempo.adiciona(musica2);
        calculadoraDeTempo.adiciona(musica2);
        calculadoraDeTempo.adiciona(musica2);

        musica2.curtir();
        musica2.curtir();
        musica2.curtir();
        musica2.curtir();
        musica2.classifica(musica2);
        musica2.exibeClassificacao(musica2);
        musica2.exibirInformacoesGerais();
        calculadoraDeTempo.exibeTempoTotalDeReproducoes();

        Podcast podcast = new Podcast();
        podcast.setApresentador("Paulo Silveira");
        podcast.setTitulo("Livros de Tecnologia que amamos - Hipsters Ponto Tech");
        podcast.setDuracao(45);
        podcast.setCalculadoraDeTempo(calculadoraDeTempo);
        podcast.reproduzir();
        calculadoraDeTempo.adiciona(podcast);
        calculadoraDeTempo.adiciona(podcast);
        calculadoraDeTempo.exibeTempoTotalDeReproducoes();
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
