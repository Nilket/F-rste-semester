package Classes;

public class TerningMain {

    public static void main(String[] args) {
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();

        System.out.println(terning1.Rul());
        System.out.println(terning2.Rul());

        if (terning1.Rul() == 1 && terning2.Rul() == 1){
            System.out.println("SNAKE EYES");
        } else if (terning1.Rul() == 6 && terning2.Rul() ==6){
            System.out.println("GG CHAMP");
        }

    }

}
