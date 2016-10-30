package praktikOtAndre.java8.functions;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

//    Consumer<String> consumer1 = n -> System.out.println(n);
        Consumer<String> consumer = System.out::println;

        consumer.accept("Jeremy");
        consumer.accept("Paul");
        consumer.accept("Richard");

    }
}
