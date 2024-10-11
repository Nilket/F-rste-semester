import java.util.Scanner;

public class AsciiArtOmvendt {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String stjerne = "*";


    System.out.println("Indtast et tal");
    int scannerInput = scanner.nextInt();

    for (int i = scannerInput; i >= 1; i--){
        String repeat = stjerne.repeat(i);
        System.out.println(repeat);
    }
    }

}
