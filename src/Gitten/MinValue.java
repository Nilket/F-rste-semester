package Gitten;

import java.util.ArrayList;
import java.util.Collections;

public class MinValue {
    private String problem;

    public static void main(String[] args) {
        printProblemDescription();
        minimumValue();
    }

    public static void printProblemDescription(){
        System.out.println("Lav en metode der viser hvordan man anvender minimum value metoden");
    }

    public static void minimumValue(){
        ArrayList<Double> sko = new ArrayList<Double>();

        sko.add(44.0);
        sko.add(44.5);
        sko.add(45.0);
        sko.add(46.0);
        sko.add(44.75);
        sko.add(39.0);
        sko.add(40.0);
        sko.add(42.0);
        sko.add(44.5);
        sko.add(43.5);
        System.out.println(sko);
        System.out.println("Den mindste sko størrelse er her: " + Collections.min(sko));

    }

}
