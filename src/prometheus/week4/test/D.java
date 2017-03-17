package prometheus.week4.test;

public enum D {
    A, B, C;

    private D()
    {
        System.out.print("*");
    }
}

 class Demo {
    public static void main(String[] args)
    {
        Enum enu = D.B;
    }
}
