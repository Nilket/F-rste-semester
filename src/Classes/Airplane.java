package Classes;

import java.util.Random;

public class Airplane { //Default contructor /Object
    private int flightNumber; //Attribut
    private String destination, departureTime; //Attribut
    private boolean onSchedule; //Attribut

    public Airplane(){ //Constructor
        this(12345, "Bangkok", "00:00", true); //Arguments
    }

    public Airplane(int flightNumber, String destination, String departureTime, boolean onSchedule){ //Parameterized constructor
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.onSchedule = onSchedule;
    }

    public String flightStatus(){ //Method
        if(onSchedule) {
            return "Your flight with flight number " + flightNumber + " to " + destination + " at " + departureTime + " is on schedule.";
        }
        else {
            return delay();
        }
    }

    public String delay(){ //Method
        return "Your flight with flight number " + flightNumber + " to " + destination + " at " + departureTime + " is delayed by 30 minutes";
    }

    public static int randomFlightNumber(){ //Method
        Random r = new Random();
        return r.nextInt(10000, 100000);
    }

        //Getters
    public int getFlightNumber() {
        return this.flightNumber;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public String getDestination() {
        return this.destination;
    }

    public boolean getOnSchedule() {
        return this.onSchedule;
    }
        //Setters
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setOnSchedule(boolean onSchedule) {
        this.onSchedule = onSchedule;
    }
}
