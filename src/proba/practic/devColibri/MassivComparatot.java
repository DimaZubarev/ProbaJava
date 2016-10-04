package proba.practic.devColibri;

import java.util.Arrays;
import java.util.Comparator;

public class MassivComparatot {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "Kyiv";
        array[1] = "Dnepr";
        array[2] = "Nikopol";
        array[3] = "Odesa";
        array[4] = "Krakov";

        System.out.println(Arrays.deepToString(array));
        Arrays.sort(array);

        Comparator<String> st = new Comparator<String>() { // сортування за довжиною
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Arrays.sort(array, st);
        System.out.println(Arrays.deepToString(array));
    }
}
