package proba.practic;

/**
 * Created by Dimon on 13.03.2017.
 */
public class ConverterTime3 {
    int converter(int day, String value){
        int time = 0;
        String var1 = "hours";
        String var2 = "minutes";
        String var3 = "seconds";
        if (value == var1) time = day * 24;
        if (value == var2) time = day * 24 * 60;
        if (value == var3) time = day * 24 * 60 * 60;
        return time;
    }

    public static void main(String[] args) {
        ConverterTime3 ct3 = new ConverterTime3();
        System.out.println(ct3.converter(3, "seconds"));
    }
}
