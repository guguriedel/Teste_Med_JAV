package model_spotify;

import java.util.*;
import model_spotify.Album;

public class Artistas {
    private String Name;
    private String ArtisticName;

    private Date dob;

    private List<Album> albuns= new ArrayList<>();

    private int getQtdAlbuns(List<Album> albuns){
        return albuns.size();
    }

    private int getTotMusica(List<Album> albums){
        int tot_music = 0;
        for (Album album : albums) {
            tot_music += album.getQtdMusica();
        }
    }
}
