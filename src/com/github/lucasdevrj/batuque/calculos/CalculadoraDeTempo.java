package com.github.lucasdevrj.batuque.calculos;

import com.github.lucasdevrj.batuque.modelos.Audio;

public class CalculadoraDeTempo {

    private int tempoTotalReproduzido;

    public int getTempoTotalReproduzido() {
        return tempoTotalReproduzido;
    }

    public int adiciona(Audio audio) {
        return tempoTotalReproduzido += audio.getDuracao();
    }

    public void exibeTempoTotalDeReproducoes() {
        System.out.println("--------------------|Tempo Total Reproduzido|--------------------");
        if (tempoTotalReproduzido >= 60) {
            int horas = tempoTotalReproduzido / 60;
            int minutos = tempoTotalReproduzido % 60;
            System.out.printf("Você reproduziu %d hora(s) e %d minuto(s) no total.\n", horas, minutos);
        } else {
            System.out.printf("Você reproduziu %d minutos no total.\n", tempoTotalReproduzido);
        }
        System.out.println("-----------------------------------------------------------------");
    }
}
