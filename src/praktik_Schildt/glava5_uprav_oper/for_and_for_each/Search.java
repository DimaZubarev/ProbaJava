package praktik_Schildt.glava5_uprav_oper.for_and_for_each;

public class Search {
    static boolean findValue(int val, int[]x){
        boolean found = false;
        for (int i : x) {
            if (val == i) found = true;
        }
        return true;
    }

    public static void main(String[] args) {

        int[] numbers = {3,9,1,4,7,5};
        System.out.println(findValue(5, numbers));

         /*int val = 5;
        boolean found = false;
        for (int number : numbers) {
            if (val == 5) found = true;
        }
        if(found)
            System.out.println("Число " + val + " знайдине");*/
    }
}
