package br.com.TomaziTecnologies.minhasmusicas.principal;

import br.com.TomaziTecnologies.minhasmusicas.modelos.MinhasPreferidas;
import br.com.TomaziTecnologies.minhasmusicas.modelos.Musica;
import br.com.TomaziTecnologies.minhasmusicas.modelos.Podcast;

public class principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Still Waiting");
        minhaMusica.setCantor("Sum 41");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }
        for (int i = 0; i <50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();{
            meuPodcast.setTitulo("Daniel Dev");
            meuPodcast.setHost("Daniel Tomazi");
        }

        for (int i = 0; i <5000; i++) {
            meuPodcast.reproduzir();
        }
        for (int i = 0; i <1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
