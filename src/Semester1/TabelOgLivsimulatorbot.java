package Semester1;

public class TabelOgLivsimulatorbot {
    public static void main(String[] args) {
        
        int age = 0;
        for (int i = 0;i<=99;i++){
            System.out.println(age);

            age++;
            if(age==7){
            System.out.println("↑" + " Starter skole");
            }
            if(age==19){
            System.out.println("↑" + " Bliver voksen");
            }
            if(age==28){
                System.out.println("↑" + " Bliver gift");
            }
            if(age==29){
                System.out.println("↑" + " Bliver skilt");
            }
            if(age==100){
                System.out.println("↑" + " Dør alene");
            }
        }

    }
}
