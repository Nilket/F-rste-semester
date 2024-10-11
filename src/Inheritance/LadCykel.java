package Inheritance;

public class LadCykel extends Cykel{

    public LadCykel(String farve, int antalkilometer, int antalhjul, double nypris){
        super(farve, antalkilometer, antalhjul, nypris);
    }

    public double newPrice(){
        return nypris;
    }

}
