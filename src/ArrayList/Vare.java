package ArrayList;

public class Vare { //Default
    private String navn; //Attributter
    private double pris; //Attributter

    public Vare(String navn, double pris){ //Constructor
        this.navn = navn;
        this.pris = pris;
    }

    //Getters
    public String getNavn(){
        return navn;
    }
    public double getPris(){
        return pris;
    }

    @Override //Metode
    public String toString(){
        return navn + " " + pris + " kr.";
    }
}
