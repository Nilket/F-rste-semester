public class WeatherWear {

    public static void Temp(double temperatur){
    if (temperatur >= 27){
        System.out.println("Pas på du ikke smelter, tag noget let på");
    } else if (temperatur >= 15) {
        System.out.println("Det er lettere koldt, tag en sweater på");
        } else if (temperatur < 15){
        System.out.println("Det er lorte koldt, tag en jakke på");
    }


    }

    public static void main(String[] args){
        Temp(14);



    }


}
