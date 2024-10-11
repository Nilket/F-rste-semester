package Inheritance;

public class Dog extends Tamagotchi {

    public Dog (String name, int age, String mood, int energy, String noise){
        super(name,age,mood,energy,noise);

    }

    @Override
    public String noise(){
        return "Woof";
    }

}
