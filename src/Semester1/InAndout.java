package Semester1;

import java.util.Scanner;

public class InAndout {
    public static void main(String[] args){

        double studentGPA = 2.0;
        String studentFirstName = "John";
        String studentLastName = "Doe";

        System.out.println(studentFirstName + " " + studentLastName + " " + "Has the GPA of " + studentGPA);
        System.out.println("What do you want to change it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " " + "Now has the GPA of " + studentGPA);

    }
}
