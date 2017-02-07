package praktik_Schildt.glava5_uprav_oper.for_and_for_each;

public class ForEach_2D {
    public static void main(String[] args) {
        int [][] numbers = new int[3][5];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                numbers[i][j] = (i+1) * (j+1);
            }
        }
        for (int[] number : numbers) {
            for (int num : number) {
                System.out.println("Value = " + num);
                sum += num;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
