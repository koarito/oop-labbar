package se.amir;

public class F6 {
    public void run(){
        Artist jacco = new Artist("Jacco");
        Album succe = new Album("Succe");
        
        succe.addSong(new Song("Darkness", 120));
        succe.addSong(new Song("Light", 154));
        jacco.addAlbum(succe);
        
       System.out.printf("Längden på Jaccos enda album är: %d sekunder\n", succe.getAlbumLenght());
}
}
