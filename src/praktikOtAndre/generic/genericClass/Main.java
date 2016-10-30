package praktikOtAndre.generic.genericClass;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        GenericClass<Aaa, Bbb>  genericClass = new GenericClass<>();

        Aaa aaa = new Aaa();
        Aaa aaa2 = genericClass.firstMetod(aaa);
        if(aaa2 != null) System.out.println("Good");

        Bbb bbb = new Bbb();
        genericClass.secondMetod(bbb);

    }
}
