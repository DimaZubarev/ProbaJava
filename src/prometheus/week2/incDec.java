package prometheus.week2;


public class incDec {
    public static void main(String[] args) {
        int i = 10;
        int i1 = 10;
        int n = i++%5;
        System.out.println(n); //0
        System.out.println(i); //11

        int t = ++i1%5;
        System.out.println(t); //1
    }

}
