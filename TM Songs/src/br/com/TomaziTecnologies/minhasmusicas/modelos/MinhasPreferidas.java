package br.com.TomaziTecnologies.minhasmusicas.modelos;

import java.io.PrintStream;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " é considerado um sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " é considerado um que muita gente está curtindo também");
        }
    }
}