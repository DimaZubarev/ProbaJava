package praktikOtAndre.java8.lambdas;

@FunctionalInterface
public interface Converter <F, T, K> {
    T converter (F from, K anotherFrom);
}
