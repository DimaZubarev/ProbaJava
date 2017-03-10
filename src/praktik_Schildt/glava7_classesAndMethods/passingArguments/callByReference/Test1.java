package praktik_Schildt.glava7_classesAndMethods.passingArguments.callByReference;

public class Test1 {
    // виклик по посиланню(перемінні в методі міняють значення)
    int a, b;

    public Test1(int i, int j){
        a = i;
        b = j;
    }
    void meth(Test1 o){
        o.a *= 2;
        o.b /= 2;
    }
}
class Test1Demo{
    public static void main(String[] args) {
        Test1 t1 = new Test1(15, 20);
        System.out.println("t1.a та t1.b до виклику: " + t1.a + " " + t1.b);

        t1.meth(t1);

        System.out.println("t1.a та t1.b після визову: " + t1.a + " " + t1.b);
    }
}
