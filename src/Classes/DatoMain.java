package Classes;

public class DatoMain {
    public static void main(String[] args) {
        Dato dag1 = new Dato();
        Dato birthday = new Dato(2, 3, 2002);


        dag1.setDay(24);
        dag1.setMonth(12);
        dag1.setYear(2024);
        System.out.println(dag1.setToday());
        System.out.println(birthday.setToday());
    }
}
