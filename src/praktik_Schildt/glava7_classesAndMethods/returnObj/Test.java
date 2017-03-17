package praktik_Schildt.glava7_classesAndMethods.returnObj;

public class Test {
    int a;
    Test(int i){
        a = i;
    }
    Test incrByTen(){
        Test test = new Test(a + 10);
        return test;
    }
}
class RetObj{
    public static void main(String[] args) {
        Test t1 = new Test(2);
        Test t2;

        t2 = t1.incrByTen();
        System.out.println("t1.a: " + t1.a);
        System.out.println("t2.a: " + t2.a);

        t2 = t2.incrByTen();
        System.out.println("t2.a після другого застосування: " + t2.a);
    }
}
