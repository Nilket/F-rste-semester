package Enums;

public class MusicTrack { //Attributter
    private String title;
    private String artist;
    private Genre genre;
    private String genreDescription;
    private int rank;

    public MusicTrack(String title, String artist, Genre genre, int rank, String genreDescription){ //Initialisere attributterne
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.rank = rank;
        this.genreDescription = genreDescription;
    }

    public void displayInfo(){ //Metoder der viser alt
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Genre: " + genre + " Description: " + genreDescription);
        System.out.println("Rank: " + rank);
        System.out.println("********************************************************************");
    }
}
