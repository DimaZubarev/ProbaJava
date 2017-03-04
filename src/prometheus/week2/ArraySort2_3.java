package prometheus.week2;

public class ArraySort2_3 {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        //PUT YOUR CODE HERE
        for (int i = 1; i < length; i++) {
            for (int j = length-1; j >= i ; j--) {
                if (array[j-1] > array[j]){
                    int var = array[j-1];
                    array[j-1] = array[j];
                    array[j] = var;
                }
            }
        }
        //PUT YOUR CODE HERE

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
