package proba.practic.devColibri.dinamicArray;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();

        set.add("AAA");
        set.add("BBB");
        set.add("ABB");
        set.add("AAB");

        System.out.println(set);
    }
}
