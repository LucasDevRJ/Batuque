package com.github.lucasdevrj.batuque.principal;

import com.github.lucasdevrj.batuque.modelos.Audio;

public class Principal {
    public static void main(String[] args) {
        Audio audio = new Audio();
        audio.setTitulo("I Gotta Feeling");
        audio.reproduzir();
    }
}
