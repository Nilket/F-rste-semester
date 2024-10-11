package ArrayList;

import java.util.ArrayList;

public class Indkøbskurv { //Default constructor
    private ArrayList<Ordrelinje> ordrelinjer; //Attribut som i dette omfang er en arrayliste

    public Indkøbskurv(){ //Constructor
        this.ordrelinjer = new ArrayList<>(); //Instanciere array listen
    }

    public void tilføjOrdrelinje(Vare vare, int antal){ //Metode
        Ordrelinje ordrelinje = new Ordrelinje(vare, antal); //Instanciere Ordrelinje klassen
        ordrelinjer.add(ordrelinje); //Add funktionen fra ArrayList
    }

    public double samletPris(){ //Metode til samlet pris
        double samletPris = 0;
        for (Ordrelinje ordrelinje : ordrelinjer){ //For each loop
            samletPris += ordrelinje.beregnPris();
        }
        return samletPris;
    }

    @Override //Metode
    public String toString(){
        String result = "";
        for (Ordrelinje ordrelinje : ordrelinjer){ //For each loop
            result += ordrelinje.toString() + "\n";
        }
        result += "Samlet pris: " + samletPris() + " Kr.";
        return result;
    }

}
