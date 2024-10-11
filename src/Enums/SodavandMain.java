package Enums;

public class SodavandMain {
    public static void main(String[] args) {
        Sodavand soda = Sodavand.Pepsi;

        System.out.println("Gustavs favorit sodavand er " + soda);

        for(Sodavand type : Sodavand.values()){
            System.out.println(type);
        }
    }
}


