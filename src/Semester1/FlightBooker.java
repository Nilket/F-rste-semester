public class FlightBooker {


    public static void getFullName(String firstName, String lastName, String gender, boolean yesNo) {
        if(yesNo) {
            String fullName = firstName + " " + lastName + " " + gender;
            System.out.println(fullName);
        } else {
            String fullName = firstName + " " + lastName;
            System.out.println(fullName);
        }


    }
    public static void main(String []args ){
        getFullName("Jonas", "Nilket-Johannesen", "male", true);

    }


}
