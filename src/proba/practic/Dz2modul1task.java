package proba.practic;

public class Dz2modul1task {
    public static void main(String[] args) {
        int[]numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, - 10};
        double[]numbers2 = {1.1, 2.2, 3.3, 4.4, - 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};

       System.out.println("sum " +sum(numbers1) + " " + sum(numbers2));
       System.out.println("min " +min(numbers1) + " " + min(numbers2));
       System.out.println("max " +max(numbers1) + " " + max(numbers2));
       System.out.println("maxPositive " +maxPositive(numbers1) + " " + maxPositive(numbers2));
       System.out.println("multiplication " +multiplication(numbers1) + " " + multiplication(numbers2));
       System.out.println("modulus " +modulus(numbers1) + " " + modulus(numbers2));
       System.out.println("secondLargest " + secondLargest(numbers1) + " " + secondLargest(numbers2));

    }

    //integer
    private static int sum(int[] array) {   //sum method
        int sum = 0;
        for (int item : array) sum += item;
        return sum;
    }

    private static int min(int array[]) {    //min method
        int min = array[0];
        for (short l = 1; l < array.length; l++) if (min > array[l]) min = array[l];
        return min;
    }
    private static int max(int array[]) {     //max method
        int max = array[0];
        for (short l = 1; l < array.length; l++) if (max < array[l]) max = array[l];
        return max;
    }

    private static int maxPositive(int array[]) {  //maxPositive method
        int max = array[0];
        for (short l = 1; l < array.length; l++){
            if (max < array[l]){
                max = array[l];
            }
        }
        return max;
    }

    private static long multiplication(int[] array) {    //multiplication method
        long multiplication = 1;
        for (long item : array) multiplication *= item;
        return multiplication;
    }

    private static int modulus(int[] array) {//modulus method
        return array[0]%array[array.length-1];
    }
    private static int secondLargest(int[] array){      //secondLargest
        int secondLargest= min(array);
        for (int anArray : array) if ((secondLargest < anArray) && (anArray < max(array))) secondLargest = anArray;
        return secondLargest;
    }
    //Double
    private static double sum(double[] array){           //sum method
        double sum = 0;
        for(double item:array) sum += item;
        return sum;
    }
    private static double min(double[] array){           //min method
        double min = array[0];
        for(short l=1;l<array.length;l++) if(min>array[l]) min = array[l];
        return min;
    }
    private static double max(double[] array){           //max method
        double max = array[0];
        for(short l=1;l<array.length;l++) if(max<array[l]) max = array[l];
        return max;
    }
    private static double maxPositive(double[] array){   //maxPositive method
        double max = array[0];
        for(short l=1;l<array.length;l++) if(max<array[l]) max = array[l];
        return max;
    }
    private static double multiplication(double[] array){    //multiplication method
        double multiplication = 1;
        for(double item:array) multiplication *= item;
        return multiplication;
    }
    private static double modulus(double[] array){           //modulus method
        return array[0]%array[array.length-1];
    }
    private static double secondLargest(double[] array) {
        double secondLargest = min(array);
        for (double anArray : array)
            if ((secondLargest < anArray) && (anArray < max(array)))
                secondLargest = anArray;
        return secondLargest;
    }
}
