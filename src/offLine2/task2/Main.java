package offLine2.task2;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter(27); // наш курс
        double grn = converter.exchangeUSDtoGRN(1000); // сумма которую мы хотим поменять (exchangeGRNtoUSD)
        System.out.println(grn); //
    }
    //System.out.println(converter.exchangeGRNtoUSD(100));



}
