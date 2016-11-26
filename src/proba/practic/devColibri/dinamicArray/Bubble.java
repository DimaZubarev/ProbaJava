package proba.practic.devColibri.dinamicArray;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] array = {20, 10, 50, 30, 40};
        for (int k = 0; k < array.length - 1; k++){
            if(array[k] > array[k + 1]) {
                swap(array, k, k + 1);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int j, int i) {
        int item = array[j];
        array[j] = array[i];
        array[i] = item;
    }
}
// 20, 40, 10, 50, 30 - не спрацьовуе = 20, 10, 40, 30, 50
// 20, 10, 50, 30, 40 - спрацьовуе = 10, 20, 30, 40, 50
