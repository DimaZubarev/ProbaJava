package prometheus.week4.test;

public enum Season {
    SPRING, WINTER;

    private Season()
    {
        System.out.println("ok");
    }
}

 class SeasonTest {
    public static void main(String[] args)
    {
        Season[] season= new Season[2];

        for (int i = 0; i  < season.length; i++)
        {
            System.out.print(season[i]);
        }
    }
}
