package offLine2.task2;
// Нам надо создать конвертер который выдает нам гривны после продажи долларов

public class Converter {

    private  final double rate;

    public Converter(double rate) {
        this.rate = rate;
    }
    public double exchangeUSDtoGRN (double sum){return sum * rate;}
    //public double exchangeGRNtoUSD (double GRN){return GRN / rate;}
}





