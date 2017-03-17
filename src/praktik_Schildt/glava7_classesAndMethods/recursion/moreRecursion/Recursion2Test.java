package praktik_Schildt.glava7_classesAndMethods.recursion.moreRecursion;
public class Recursion2Test {
    public static void main(String[] args) {
        Recursion2 r2 = new Recursion2(10);
        for (int i = 0; i < 10; i++) r2.values[i] = i;
        r2.printArray(10);
    }
}
