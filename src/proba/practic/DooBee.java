package proba.practic;

public class DooBee {
    public static void main(String[] args) {
        int x = 1;
        while (x < 3) {
            System.out.println("Doo");
            System.out.println("Bee");
            x = x +1; //  более удобная запись fx++
        }
        if (x == 3) {
            System.out.println("Do");
        }
    }
}