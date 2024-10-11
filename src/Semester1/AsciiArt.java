import java.util.Scanner;

public class AsciiArt {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String stjerne = "*";


        System.out.println("Vælg et tal");
        int scannerInput = scanner.nextInt();


        for (int i = 1; i <= scannerInput; i++){
           String repeat = stjerne.repeat(i);
            System.out.println(repeat);
        }

    }

}
