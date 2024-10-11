package Semester1;

public class TestPrint {
    public static void main(String[] args){
        String h = "I am happy today";

        for (int i = 1; i <=10; i++){


            System.out.println(h.toUpperCase().replaceAll(" ", "\uD83D\uDC4F"));
        }
    }
}
