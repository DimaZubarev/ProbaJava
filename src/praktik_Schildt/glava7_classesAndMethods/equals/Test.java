package praktik_Schildt.glava7_classesAndMethods.equals;

/**
 * Created by Dimon on 09.03.2017.
 */
public class Test {
    int a;
    int b;

    public Test(int i, int j){
        a = i;
        b = j;
    }

    boolean equals(Test o){
        if(o.a == a && o.b == b)return true;
        else return false;
    }
}
class PassOb{
    public static void main(String[] args) {
        Test t1 = new Test(11,22);
        Test t2 = new Test(11,22);
        Test t3 = new Test(111,222);

        System.out.println(t1.equals(t2));
        System.out.println(t2.equals(t3));
        System.out.println(t1.equals(t3));
    }
}
