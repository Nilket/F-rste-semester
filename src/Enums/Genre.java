package Enums;

enum Genre { //Definerer genre
    POP("Pop music is an abbreviation of the word 'popular. ' It's a contemporary form of music that appeals to a very wide audience."),
    ROCK("Rock music is famous for having a strong backbeat, usually in 4/4 rhythm, although more progressive styles can employ trickier time signatures."),
    HIP_HOP("Hip-hop is a genre of music most often characterized by a strong, rhythmic beat and a rapping vocal track."),
    R_AND_B("Historically speaking, though, \"rhythm and blues\" as we understand it today most often describes a style of music that developed after World War II that combines elements of pop, gospel, blues and jazz with a strong back beat."),
    COUNTRY("Country music is known for its ballads and dance tunes (i.e., \"honky-tonk music\") with simple form, folk lyrics, and harmonies generally accompanied by instruments such as banjos, fiddles, harmonicas, and many types of guitar");

    private String descrip;

    Genre(String descrip){
        this.descrip = descrip;
    }

    public String getDescrip(){ //Metode der giver og description
        return descrip;
    }

}
