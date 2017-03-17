package prometheus.week4.test;

public class OuterClass {
    static class InnerClass
    {
        int i = 10;
    }
    //OuterClass. new InnerClass().i;
    //OuterClass.InnerClass.i;
    //new OuterClass.InnerClass().i;
}
class OuterTest{
    public static void main(String[] args) {
//        OuterClass.InnerClass oi = new OuterClass.InnerClass();
//        System.out.println(oi.i);
        System.out.println(new OuterClass.InnerClass().i);
    }
}
