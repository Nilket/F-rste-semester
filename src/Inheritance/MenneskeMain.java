package Inheritance;

public class MenneskeMain {

    public static void main(String[] args) {
       Menneske et = new Menneske("Dorthe","Henrik");
       Menneske to = new Menneske("Flemming","Anne-Grete");

        System.out.println(et.gifterSigMed());
        System.out.println(to.bliverSkilt());

    }
}
