package Enums;

public class MusicExample {
    public static void main(String[] args) {
        //Instanciere de forskellige tracks
        MusicTrack gio = new MusicTrack("Summertime", "Giovanni Hidalgo", Genre.ROCK, 2000, Genre.ROCK.getDescrip());
        MusicTrack riri = new MusicTrack("Only girl(In the world)", "Rihanna", Genre.POP, 7, Genre.POP.getDescrip());
        MusicTrack ozzy = new MusicTrack("Alt jeg ved", "Ozzy", Genre.COUNTRY, 1000, Genre.COUNTRY.getDescrip());
        MusicTrack joey = new MusicTrack("Shine", "Joey Badass", Genre.HIP_HOP, 1, Genre.HIP_HOP.getDescrip());

        //Bruger metoden
        gio.displayInfo();
        riri.displayInfo();
        ozzy.displayInfo();
        joey.displayInfo();
    }
}
