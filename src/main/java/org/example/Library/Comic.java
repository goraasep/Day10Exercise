package org.example.Library;

public class Comic extends Book {
    private String genre;
    private int volume;

    Comic(String itemName, String publisher, int pages, String genre, int episode, int stock) {
        super(itemName, publisher, pages, stock);
        this.genre = genre;
        this.volume = episode;
    }

    public String getGenre() {
        return genre;
    }

    public int getVolume() {
        return volume;
    }
}
