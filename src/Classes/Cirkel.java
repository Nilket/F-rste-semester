package Classes;

public class Cirkel {
    double radius;


    public Cirkel(double radius){
        this.radius = radius;

    }
    public double BeregnAreal(){
        return(this.radius * this.radius) / Math.PI;

    }

}
