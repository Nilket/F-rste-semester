package Classes;

public class PersonMain {
    public static void main(String[] args) {
        Person Gustav = new Person("Gustav", "Roque", "Gay", 14);
        Person Hannibal = new Person("Hannibal", "Ussing", "Tysker", 19);

        System.out.println(Gustav.information());
        System.out.println(Hannibal.information());
    }
}
