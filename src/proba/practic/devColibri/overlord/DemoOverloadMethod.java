package proba.practic.devColibri.overlord;

public class DemoOverloadMethod {
    public static void main(String[] args) {

       OverloadMethod overMet = new OverloadMethod();

        System.out.println(overMet.get());
        System.out.println(overMet.get("Dimon sinior"));
        System.out.println(overMet.get(32));
        System.out.println(overMet.get("заробляє", 4800));
    }
}
