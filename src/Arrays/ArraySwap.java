package Arrays;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] number = {1, 2 ,3 ,4 ,5, 6, 7};


        for (int i = 0; i < 6 ; i++) {
            int temp = number[i];
            number[i] = number[number.length - 1-i];
            number[number.length - 1-i] = temp;
            System.out.println(Arrays.toString(number));
        }

    }
}
