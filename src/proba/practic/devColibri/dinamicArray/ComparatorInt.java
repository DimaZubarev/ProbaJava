package proba.practic.devColibri.dinamicArray;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorInt {
    public static void main(String[] args) {

        List<Integer> listnum = new ArrayList<>();
        listnum.add(10);
        listnum.add(19);
        listnum.add(1);
        listnum.add(33);
        listnum.add(75);
        listnum.add(57);
        listnum.add(3, 55);
        System.out.println(listnum);

        Comparator<Integer> c = new Comparator<Integer>() { // сортування  від малого до великого
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1 - i2;  // i2 - i1  сортування від великого до малого
            }
        };
        listnum.sort(c);
        System.out.println(listnum); // 'kj'kjfa'
    }

}
