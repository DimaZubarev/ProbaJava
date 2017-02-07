package proba.practic.devColibri.dinamicArray;

import java.util.Arrays;

public class ArrayNewProba2 {
    public static void main(String[] args) {

        int[] dub = {1, 2, 3, 4, 5, 7};
        for(int k = 0; k < dub.length; k ++) {
           System.out.print(dub[k] + " "); }

        int dubLength = dub.length;
        int firstNumber = dub[0];
        int lastNumber = dub[dubLength - 1];

        System.out.println(" ");
        System.out.println(Arrays.toString(dub));
        System.out.println(dubLength);
        System.out.println(firstNumber);
        System.out.println(lastNumber);

        for (int i = 0; i < dub.length - 1 ; i++) {
            swap(dub, i, i + 1);
        }
        System.out.println(Arrays.toString(dub));

    }

    private static void swap(int[] dub, int i, int j) { // метод який першу цифру ставить в кінець масива
        int imet = dub[i];
        dub[i] = dub[j];
        dub[j] = imet;
    }
}
