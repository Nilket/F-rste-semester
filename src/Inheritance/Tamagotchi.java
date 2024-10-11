package Inheritance;

public class Tamagotchi { //Default constructor med værdier
    protected String name;
    protected int age;
    protected String mood;
    protected int energy;
    protected String noise;

    //Super constructor
    public Tamagotchi(String name, int age, String mood, int energy, String noise){
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
        this.noise = noise;
    }

    //Metoder
    public void Play(){
        this.energy -= 2;
    }

    public void Feed(){
        this.energy += 1;

    }

    public void Sleep(){
        this.energy += 10;
    }

    public String noise(){
        return ("Moo");
    }

    //Getters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getMood(){
        return this.mood;
    }
    public int getEnergy(){
        return this.energy;
    }
    public String getNoise(){
        return this.noise;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setMood(String mood){
        this.mood = mood;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public void setNoise(String noise){
        this.noise = noise;
    }
}
