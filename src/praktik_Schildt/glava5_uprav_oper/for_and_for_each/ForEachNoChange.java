package praktik_Schildt.glava5_uprav_oper.for_and_for_each;

public class ForEachNoChange {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        for (int num : nums) {
            num =  num * 10;
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : nums)
            System.out.print(num + " ");
    }
}
