package Arrays;

import java.util.Arrays;

public class Arraytest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array1 = {1, 2, 3};
        //Disse to kan ikke bare compares

        //Her gemmer vi værdien af begge arrays
        int arrayNums = 0;
        int arrayNums1 = 0;

        //For loop for værdien af første array
        for (int i = 0; i < array.length; i++){
            arrayNums = array[i];
        }
        //For loop for værdien af anden array
        for (int i = 0; i < array1.length; i++) {
            arrayNums1 = array1[i];
        }

        //If & else statements til at printe ud hvis de er lige med hinanden eller ikke.
        if (arrayNums == arrayNums1) {
            System.out.println("The arrays are equal");
        } else {
            System.out.println("The arrays are not equal");
        }

        //Compare arrays funktionen der giver 0 hvis de er lige med hinanden 1 hvis første array er større end array2 og -1 hvis omvendt
        System.out.println(Arrays.compare(array, array1));

        //Equal funktionen der giver enten true eller false
        System.out.println(Arrays.equals(array, array1));

        //Her gør vi det til en string og printer hele arrayen ud
        int[] arr = {9, 14 , 27, 13};
        arr[1] = arr[2] + arr[3];
        System.out.println("Array is " + Arrays.toString(arr));
        Arrays.stream(arr).forEach(System.out::println);
    }





}
