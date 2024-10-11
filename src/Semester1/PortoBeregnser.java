package Semester1;
import java.util.Scanner;

/*Lav en klasse der hedder Portoberegner.
Portoberegner-klassen har en Scanner der kan læse ind fra tastaturet hvor meget et brev vejer. Vægten angives i hele gram.
Gå ind på PostNords hjemmeside og se hvad det koster at sende et brev i Danmark. Din portoberegner skal kunne regne ud hvad det koster at sende breve i Danmark op til og med 2000 gram.
Lav en int variabel i din klasse som hedder pris. Denne sættes fra starten til værdien 0.
Brug if-else til at afgøre hvad prisen på forsendelsen skal være. I stedet for at skrive prisen ud med System.out.println inde i hver if-sætning sættes værdien af variablen pris som så først udskrives til sidst.
Hvis brugeren skriver et antal gram som er 0 eller et negativt tal, eller mere end 2000 gram, så skal programmet udskrive ”Et brev med denne vægt kan vi ikke sende”.
*/

public class PortoBeregnser {

    public static void main(String[] args) {
        System.out.println("Hej og velkommen til Postnord");
        System.out.println("Hvor meget vejer din pakke");


            Scanner input = new Scanner(System.in);
            int inputtedNum = input.nextInt();


            if (inputtedNum < 0) {
                System.out.println("Din pakke skal veje noget");
            }
            if (inputtedNum > 0 && inputtedNum < 101) {
                System.out.println("Din pakke koster 25 kr");
            }
            if (inputtedNum > 101 && inputtedNum < 251) {
                System.out.println("Din pakke koster 50 kr");
            }
            if (inputtedNum > 251 && inputtedNum < 2001) {
                System.out.println("Din pakke koster 75 kr");
            }
            if (inputtedNum > 2000) {
                System.out.println("Din pakke vejer for meget ");
            }




            }


        }

