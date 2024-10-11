package Semester1;

public class Celcius {
    public static void main(String[] args){
        // Dette er en beregning af fahrenheit til celcius
        int F = 100;
        double C = (F - 32) / 1.8;
        String convert = F + " fahrenheit i celcius er: ";

                System.out.println(convert + C);
    }
}
