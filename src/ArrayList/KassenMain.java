package ArrayList;

public class KassenMain {
    public static void main(String[] args) { //Main
        Vare mælk = new Vare("Mælk", 10); //Instanciere varer
        Vare brød = new Vare("Brød", 15);
        Vare æg = new Vare("Æg",25);

        Indkøbskurv kurv = new Indkøbskurv(); //Instanciere en indkøbskurv

        kurv.tilføjOrdrelinje(mælk, 3); //Tilføjer varer til kurven
        kurv.tilføjOrdrelinje(brød, 5);
        kurv.tilføjOrdrelinje(æg, 2);

        System.out.println(kurv.toString()); //Printer det hele med toString funktionen fra indkøbskurven.

    }
}
