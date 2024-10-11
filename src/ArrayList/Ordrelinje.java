package ArrayList;

public class Ordrelinje { //Default constructor
    private Vare vare; //Attribut som kalder Vare klassen
    private int antal; //Attributter

    public Ordrelinje(Vare vare, int antal){ //Constructor
        this.vare = vare;
        this.antal = antal;
    }

    public double beregnPris(){ //Metode der beregner pris
        return vare.getPris() * antal;
    }

    @Override //Metode
    public String toString(){
        return antal + " x " + vare.toString() + " = " + beregnPris() + " kr.";
    }
}
