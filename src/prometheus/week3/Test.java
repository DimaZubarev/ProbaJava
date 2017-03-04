package prometheus.week3;

public class Test {
    int a, b;

    public Test() {
        a = 10;
        b = 20;
    }
}
class Run{
    public static void main(String[] args) {
        Test obj1 = new Test();
        Test obj2 = obj1;

        obj1.a +=1;
        obj1.b +=1;

        obj2.a +=1;
        obj2.b +=1;

        System.out.println(obj2.a + "," + obj2.b);



    }
}
