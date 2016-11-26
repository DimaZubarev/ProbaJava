package proba.practic.devColibri.dinamicArray;

import java.util.Arrays;

public class ArrayNewProba {
    public static void main(String[] args) {

        int[] numbers = {10, 12, 6, 9, 19, 20, 88, 1, 5, 33};

        int arrayLength = numbers.length;
        int firstNumber = numbers[0];
        int lastNumber = numbers[arrayLength-1];

        System.out.print("All numbers: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }

        System.out.println("");
        System.out.println("arrayLength: " + arrayLength);
        System.out.println("firstNumber: " + firstNumber);
        System.out.println("lastNumber: " + lastNumber);
        System.out.println(Arrays.toString(numbers));
    }
}
