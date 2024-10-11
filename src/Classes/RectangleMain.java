package Classes;

public class RectangleMain {

    public static void main(String[] args){
        Rectangle rec1 = new Rectangle(); //Instanciere
        Rectangle rec2 = new Rectangle(30, 75); //Instancierer

        rec1.setWidth(25); //Giver værdi
        rec1.setLength(50);
        double areaOfRec1 = rec1.calculateArea(); //Bruger funktionen fra rectangle calculateArea her med rec1
        double areaOfRec2 = rec2.calculateArea(); //Bruger funktionen fra rectangle calculateArea her med rec2

        System.out.println(areaOfRec1);
        System.out.println(areaOfRec2);
    }
}
