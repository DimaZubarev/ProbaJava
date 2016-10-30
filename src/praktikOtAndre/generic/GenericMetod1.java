package praktikOtAndre.generic;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericMetod1 {
    static <T> Collection<T> fromArrayToCollection(T[]namber, Collection<T> ccc){
//      T element = namber[1]; // T, I, K, L приорітет по джинерікам
        for(T element : namber) {
            ccc.add(element);
        }
        return ccc;
    }

    public static void main(String[] args) {
        Integer[] array = {3, 97, 65, 56, 11};
        List<Integer> list = new ArrayList<>();
        list.add(1);

        System.out.println(GenericMetod1.fromArrayToCollection(array, list));
    }
}
