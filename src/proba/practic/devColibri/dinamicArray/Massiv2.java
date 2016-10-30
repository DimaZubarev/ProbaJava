package proba.practic.devColibri.dinamicArray;

public class Massiv2 {
    public static void main(String[] args) {

        int[] numbers = {1556, 6548, 5154, 9451, 14589, 657, 954, 9887, 94617, 67489};

        System.out.println(sum(numbers));
    }
    static int sum (int [] numbers){
        int sum = 0;
        for (int num : numbers) sum += num;
        return sum;}






}