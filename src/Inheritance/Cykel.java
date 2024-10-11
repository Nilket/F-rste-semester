package Inheritance;

public class Cykel {
    public String farve;
    public int antalkilometer;
    public int antalhjul;
    public double nypris;

    public Cykel(String farve, int antalkilometer, int antalhjul, double nypris){
        this.farve = farve;
        this.antalkilometer = antalkilometer;
        this.antalhjul = antalhjul;
        this.nypris = nypris;
    }
    public String toString(){
        return "Ladcyklen er " + farve + " Den har " + antalhjul + " hjul " +  " og den koster " + nypris;
    }
}
