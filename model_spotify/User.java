package model_spotify;

import java.util.List;
import java.util.ArrayList;

public class User {
    private String login;
    private String senha;
    private int Id;

    private UserDAO userDao;

    public List<Playlist> playlist = newArrayList<>();
    private List<Music> musicas = newArrayList<>();


    public boolean VerifyLogin(String login, String senha){
        return this.senha.equals(senha) && this.login.equals(login);
    }

    public boolean musicListen(Musica musica){
        return musicas.contains(musica);
    }

    public boolean favMusic(Musica musica){
        return musicas.add(musica);
    }

    public boolean criarPlaylist(String nome) {
        playlist.add(new Playlist(nome));
        return true;
}

    
}
