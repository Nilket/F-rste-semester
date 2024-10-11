package Classes;


import java.util.Random;

public class Terning {
    int max = 6;
    int faceValue;
    Random rul = new Random();

    public Terning(){
      this.faceValue = rul.nextInt(max)+1;
    }

    public int Rul(){
        return faceValue;
    }

}
