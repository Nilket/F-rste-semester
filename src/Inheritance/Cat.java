package Inheritance;

public class Cat extends Tamagotchi {

    public Cat(String name, int age, String mood, int energy, String noise) {
        super(name, age, mood, energy, noise);

    }

    @Override
    public String noise(){
      return ("Meow");
    }


}