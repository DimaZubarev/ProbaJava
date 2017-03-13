package proba.practic;

public class ConverterTime {

    int converter(int day, String value){
        int time = 0;
        value = "hours";
        value = "minutes";
        value = "seconds";

        switch (value){
            case "hours":
                time = day * 24;
                break;
            case  "minutes":
                time = day * 24 * 60;
                break;
            case "seconds":
                time = day * 24 * 60 * 60;
                break;
                default:
                    time = 0000;
        }
        return time;
    }

    public static void main(String[] args) {
        ConverterTime ct = new ConverterTime();
        System.out.println(ct.converter(3, "hours"));
    }
}
