package proba.practic.devColibri;

public class Massiv {

    static int[] numbers1 = new int[5];
    static double[] numbers2 = {2.3, 3.5, 6.7, 8.9, 9.1};

    public static void main(String[] args) {

        numbers1[0] = 1;
        numbers1[1] = 5;
        numbers1[2] = 7;
        numbers1[3] = 3;
        numbers1[4] = 8;

        for (int n : numbers1){
            System.out.println(n);
        }

        System.out.println("");

        for(int i = 0; i < numbers2.length; i++){
            System.out.println(i + " : " + numbers2[i]);
        }
    }
}
