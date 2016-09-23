package offLine3.task1;

public class Calc implements MoneyConverter {

    int k = 27;

    @Override
    public double convertFromUSD(int i) {
        int result = i / k;
        return result;
    }

}














