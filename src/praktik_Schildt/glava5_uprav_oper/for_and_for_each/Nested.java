package praktik_Schildt.glava5_uprav_oper.for_and_for_each;

/**
 * Created by Dimon on 26.01.2017.
 */
public class Nested {
    // не розумію як воно рахує
    public static void main(String[] args) {
        int i, j;
        int k, l;
        for (i = 10; i > 0; i--) {
            for (j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (k = 0; k < 10; k++) {
            for (l = k; l < 10; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
