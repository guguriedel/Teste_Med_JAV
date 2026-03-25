package model_spotify;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private int UserId;
    private String nome;
    private List<Music> musicas = newArrayList<>();

    public Playlist (String nome){
        this.nome = nome;
    }

    public boolean addMusic(Music musica){
        return this.musicas.add(musica);
    }



    
}
