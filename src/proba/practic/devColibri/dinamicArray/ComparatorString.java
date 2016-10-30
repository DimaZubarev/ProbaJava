package proba.practic.devColibri.dinamicArray;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorString {
    public static void main(String[] args) {

        List<String> listword = new ArrayList<>();
        listword.add("Kyiv");
        listword.add("Odesa");
        listword.add("Dnepr");
        listword.add("Nikopol");
        listword.add("Krakov");
        System.out.println(listword);

        Comparator<String> s = new Comparator<String>() { //сортування за алфавітом
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        listword.sort(s);
        System.out.println(listword);
    }
}
