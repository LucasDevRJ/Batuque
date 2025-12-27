package com.github.lucasdevrj.batuque.principal;

import com.github.lucasdevrj.batuque.modelos.Musica;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("I Gotta Feeling");
        musica.setDuracao(4);
        musica.reproduzir();
        musica.reproduzir();
        musica.curtir();
        musica.curtir();
    }
}
