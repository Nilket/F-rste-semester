package Functions;



public class Exercise3 {
//Implement a BMI calculator method. Identify the needed parameters and return type.

    public static double bmi() {
        double height = 1.70;
        double weight = 53;
        double bmiSvar = weight / (height * height);
        return bmiSvar;

    }

    
    public static void main(String[] args){
        System.out.print(bmi());

    }

}
