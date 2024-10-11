package Enums;

public class IceCreamMain {

    public static void main(String[] args) {
        IceCream a = IceCream.Vanilla;

        System.out.println("Favorit is " + a);


        for (IceCream type : IceCream.values()) {
            System.out.println(type + ": " + type.getDeliciousnessLevel() + " out of 10 " + type.getColour());

        }

    }
    }
