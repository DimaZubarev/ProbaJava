package praktik_Schildt.glava5_uprav_oper.for_and_for_each;
public class ForEachAndBreak {
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for (int num : nums) {
            System.out.println("num = " + num);
            sum += num;
            if (num == 5) break;
        }
        System.out.println("Сумма перших 5 чисел = " + sum);
    }
}
