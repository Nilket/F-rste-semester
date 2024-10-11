package Enums;

public class CarsMain {
    public static void main(String[] args) {
        Cars min = Cars.Skoda;
        System.out.println("De fedeste biler er " + min);


        for(Cars type : Cars.values()){
            System.out.println(type);
        }

    }

}
