package praktik_Schildt.glava4_operation;
public class Ternary {
    public static void main(String[] args) {
        int i,k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.println("i = " + i + " k = " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("i = " + i + " k = " + k);
    }
}
