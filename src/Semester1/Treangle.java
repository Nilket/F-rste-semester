public class Treangle {

    public static void main(String[] args) {
        printTriangle(new Integer[] {1,2,3,4});




    }

    public static void printTriangle(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int col = 0; col <= i; col++) ;
            {
                System.out.println(arr);
            }
        }
    }



}
