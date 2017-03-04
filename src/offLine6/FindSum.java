package offLine6;

public class FindSum{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int number = 10;
        for (int i = 0; i <= numbers.length; i++) {
            for (int j = 0; j <= numbers.length; j++) {
               if (i + j == number)
                   System.out.println(i + " + " + j + " == " + number);
            }
        }
    }
}
