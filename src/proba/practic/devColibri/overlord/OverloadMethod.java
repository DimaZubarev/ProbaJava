package proba.practic.devColibri.overlord;

public class OverloadMethod {

    public String get() {
        return "Dimon developer";
    }

    public String get(String st) {
        return st;
    }

    public String get(int i) {
        return "Dimonu " + i;
    }

    public String get (String str, int in) {
        return "Dimon " + str + " " + in + " $";
    }

}
