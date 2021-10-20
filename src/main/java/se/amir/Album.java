package se.amir;

import java.util.ArrayList;

public class Album {
    private String title;
    private ArrayList<Song> songs = new ArrayList<>();
    public Album(String title) {
        super();
        this.title = title;
    }
    public int getAlbumLenght(){
        int sum = 0;
        for(Song song: songs)
        sum += song.getLenght();
        return sum;
    }
    
     public void addSong(Song song){
       songs.add(song);
    }
    public ArrayList<Song> getSongs(){
        return songs;
    }
}
