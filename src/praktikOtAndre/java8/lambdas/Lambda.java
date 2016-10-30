package praktikOtAndre.java8.lambdas;

import praktikOtAndre.java8.lambdas.Converter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Dima", "Denis", "Anna", "Bob", "Pavel");

//        Collections.sort(names, new Comparator<String>() { // сортування в java7
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        Collections.sort(names, (a, b) -> a.compareTo(b)); // сортування в java8
        System.out.println(names);

        // метод з java7
//        Converter<String, Integer, Long> converter2 = new Converter<String, Integer, Long>() {
//            @Override
//            public Integer converter(String from, Long anotherLrog) {
//                if(anotherLrog ==10) return 10;
//                return Integer.valueOf(from);
//            }
//        };
        // метод з java8
        Converter<String, Integer, Long> converter = (from, anotherFrom) -> {
            if(anotherFrom ==10) return 10;
            return Integer.valueOf(from);
        };

        // test
        long input = 20;
        System.out.println(converter.converter("123", input));

    }
    /*
    Lambda працює тільки з функціональними інтерфейсами, це інтерфейси що мають один абстрактний метод (Runnable,
    ActionListener, Comparator, Callable та інші).
     */

}
