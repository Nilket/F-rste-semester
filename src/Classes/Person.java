package Classes;

public class Person {
    String firstName;
    String lastName;
    String middleName;
    int age;

    public Person(String firstName, String lastName, String middleName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
    }
    public String information(){
        return(this.firstName + " " + this.lastName + " " + this.middleName + " " + age);

    }

}
