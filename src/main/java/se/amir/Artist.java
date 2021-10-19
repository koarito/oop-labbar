package se.amir;
import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Album> albums = new ArrayList<>();

    public Artist(String name) {
        super();
        this.name = name;
    }
    public void addAlbum(Album album){
        albums.add(album);
    }
    public ArrayList <Album> getAlbums(){
        return albums;
    }
}
