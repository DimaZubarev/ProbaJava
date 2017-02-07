package praktik_Schildt.glava4_operation;
public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = ++a; // 1. a = a + 1; 2. c = a;  спочатку плюсується, потім присвоюється - постпрефіксна форма
        int d = b++; // 1. d = b; 2. b = b + 1;  спочатку присвоюється, потім плюсується - префіксна формаб
        System.out.println(c);
        System.out.println(d);

        int a1 = 1;
        int b1 = 2;
        int c1, d1;
        c1 = ++b1;
        d1 = a1++;
        c1++;
        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1);
        System.out.println("d1 = " + d1);

    }
}
