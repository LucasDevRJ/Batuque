package com.github.lucasdevrj.batuque.modelos;

import com.github.lucasdevrj.batuque.calculos.CalculadoraDeTempo;

public class Audio implements CalculadoraDeTempo {

    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;
    private boolean estaReproduzindo;
    private int tempoTotalReproduzido;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return tempoTotalReproduzido / totalDeReproducoes;
    }

    public void curtir() {
        System.out.println("Você curtiu \"" + titulo + "\" com sucesso.");
        curtidas++;
    }

    public void reproduzir() {
        if (!estaReproduzindo) {
            System.out.println("Reproduzindo \"" + titulo + "\".");
            totalDeReproducoes++;
            estaReproduzindo = true;
        } else {
            System.out.println("O \"" + titulo + "\" já esta sendo reproduzido.");
        }
    }

    public void pausar() {
        if (estaReproduzindo) {
            System.out.println("Você pausou o \"" + titulo + "\".");
            estaReproduzindo = false;
        } else {
            System.out.println("O \"" + titulo + "\" não está sendo reproduzido, por isso não é possível pausa-lo.");
        }
    }

    public void encerrar() {
        if (estaReproduzindo) {
            System.out.println("Você encerrou o \"" + titulo + "\".");
            estaReproduzindo = false;
        } else {
            System.out.println("O \"" + titulo + "\" não está sendo reproduzido, por isso não é possível encerra-lo.");
        }
    }

    public void exibirInformacoesGerais() {
        String informacoes = """
                --------------------|Informações Gerais|--------------------
                Nome: %s
                Duração: %d minutos
                Total de Reproduções: %d
                Total de Curtidas: %d
                Classificação: "%d" de 100
                ------------------------------------------------------------
                """.formatted(titulo, duracao, totalDeReproducoes, curtidas, getClassificacao());
        System.out.println(informacoes);
    }

    @Override
    public int adiciona(Audio audio) {
        return tempoTotalReproduzido += audio.getDuracao();
    }

    @Override
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
