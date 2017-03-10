package praktik_Schildt.glava7_classesAndMethods.passingArguments.callByValue;
public class Test {
    // виклик по значенню(перемінні в методі не змінюються)
    void meth(int i, int j){
        i *= 2;
        j /= 2;
    }
}
class TestDemo{
    public static void main(String[] args) {
        Test t = new Test();
        int a = 15, b = 20;

        System.out.println("a та b до виклику: " + a + " " + b);

        t.meth(a, b);

        System.out.println("a та b після визову: " + a + " " + b);
    }
}
