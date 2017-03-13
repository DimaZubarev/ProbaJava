package proba.practic;

/**
 * Created by Dimon on 13.03.2017.
 */
public class ConverterTime2 {
    public static void main(String[] args) {
        int day = 3;
        int time;
        String value = "seconds";
        switch (value){
            case "hours":
                System.out.println(time = day * 24);
                break;
            case  "minutes":
                System.out.println(time = day * 24 * 60);
                break;
            case "seconds":
                System.out.println(time = day * 24 * 60 * 60);
                break;
            default:
                System.out.println("Невідомий вимір часу");

        }
    }
}
