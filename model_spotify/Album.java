package model_spotify;

import java.util.*;

public class Album {
    private String titulo;
    private int anoLanc;

    private List<Artistas> artistas= newArrayList<>();
    private List<Music> musicas = newArrayList<>();


    public int getQtdMusica(){
        return musicas.size();
    }

}
