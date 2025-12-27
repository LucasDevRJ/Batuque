package com.github.lucasdevrj.batuque.classificacao;

import com.github.lucasdevrj.batuque.modelos.Audio;

public interface Classificavel {

    int classifica(Audio audio);
    void exibeClassificacao(Audio audio);
}
