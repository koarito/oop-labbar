package se.amir;

public class Song {
    private int lenght;
    private String title;

    public Song(String title, int lenght) {
      super();
      this.title = title;
      this.lenght = lenght;
    }
    public int getLenght() {return lenght;}
    public String getTitle() {return title;}
}
