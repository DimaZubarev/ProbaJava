package offLine3.task1;

public class Main {

    public static void main(String[] args) {
        Calc MoneyConverter = new Calc();
        demonstrate(MoneyConverter, 600);
    }

    private static void demonstrate(MoneyConverter moneyConverter, int k) {
        System.out.println(moneyConverter.convertFromUSD(k));
    }
}
