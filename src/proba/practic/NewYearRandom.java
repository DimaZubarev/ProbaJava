package proba.practic;

public class NewYearRandom {
    public static void main(String[] args) {
        int i = (int)(Math.random()*31 + 1);
        System.out.println("Новий рік почнемо святкувати з " + i + " числа");

        double d = (double)(Math.random()*2000);
        System.out.println("І на це свято ми можемо використати аж " + d + " гривень");
    }

}
