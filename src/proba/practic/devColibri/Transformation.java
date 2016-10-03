package proba.practic.devColibri;

public class Transformation {

    static int i = 10;
    static int i2 =6;
    static  double d = 5.5;
    static double d3 = 6.7;

    public static void main(String[] args) {
        // З дабла в інт 1
        Number n1 = d;
        int i1 = n1.intValue();
        // З дабла в інт 2
        Number n2 = new Double(3.5);
        int i4 = n2.intValue();
        // З дабла в інт 3
        int i3 = (int)d3;
        // З інт в дабл 1
        double d1 = (double)i;
        // З інт в дабл 2
        double d2 = i2;
        // З інт в дабл 3
        Number n3 = new Integer(4);
        double d3 = n3.doubleValue();


        System.out.println("З дабла в інт");
        System.out.println(i1);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println("");
        System.out.println("З інт в дабл");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }

}
