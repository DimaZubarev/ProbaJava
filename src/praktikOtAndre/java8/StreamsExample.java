package praktikOtAndre.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> collectionString = new ArrayList<>();
        collectionString.add("abc");
        collectionString.add("cba");
        collectionString.add("bac");
        collectionString.add("cab");
        collectionString.add("acb");
        collectionString.add("bis");
        collectionString.add("biss");

        Predicate<String> strPred = s -> s.length() == 3 && s.contains("c") || s.contains("i");
        collectionString.stream()
                .filter(strPred)                   // філтр з логікою s -> s.length() == 4
                .sorted(String::compareTo)         // сортування теж саме, але більш громоздке(a,b) -> a.compareTo(b)
                .map(String::toUpperCase)          // заміна маленьких літер на великі n -> n.toUpperCase()
                .forEach(System.out::println);     // теж саме, але більш громоздке forEach(s -> System.out.println(s))


    }
}
