package prometheus.week4.test;
public enum DDD {
    DEMO;
    int i = 10;

    {
        i--;
    }

    {
        --i;
    }

    private DDD()
    {
        i = i-- + --i;
    }
}
class TsetDemo{
    public static void main(String[] args) {
        System.out.println(DDD.DEMO.i);
    }
}
