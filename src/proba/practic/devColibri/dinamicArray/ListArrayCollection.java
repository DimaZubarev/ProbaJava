package proba.practic.devColibri.dinamicArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListArrayCollection {
    public static void main(String[] args) {

        // List listNambers = new ArrayList(); - в такому вигляді ми можемо добавляти будь що (String, int, double ...)
        List <Integer> listNambers = new ArrayList<>();

        listNambers.add(2); // add додає елемент до колекції
        listNambers.add(8);
        listNambers.add(6);
        listNambers.add(18);
        listNambers.add(81);
        System.out.println("Add: " + listNambers);

        listNambers.add(1, 33); // add (2) додає (індекс, та число), всі наявні числа здвигаються праворуч
        System.out.println("Add(2): " + listNambers);

        listNambers.set(1,44); // set додає число по індексу, затераючи те число яке там стояло раніше, довжина ліста не збільшується
        System.out.println("Set: " + listNambers);

        System.out.println("Get: " + listNambers.get(3)); // get - надає число по індексу

//       listNambers.clear(); - clear видаляє всю коллекцію

//       listNambers.remove(2); - remove видаляє потрібне число за індексом
//       listNambers.remove(2); - remove(2) видаляє потрібне число (чомусь не спрацювало)

       for (Integer number : listNambers){ // виводить всі числа
          System.out.print("Number of list " + number);
       }
        System.out.println("");

       List <Integer> listNambers2 = new ArrayList<>();

        listNambers2.add(333);
        listNambers2.add(222);
        listNambers2.add(111);
        listNambers.addAll(listNambers2); // addAll додає до потрібного нам листа, інший лист
        System.out.println("AddAll: " + listNambers);

        listNambers2.add(444);
        listNambers.addAll(3, listNambers2); // addAll(2) додає до потрібного намл листа, інший лист з потрібного нам індексу
        System.out.println("AddAll(2): " + listNambers);

        System.out.println("indexOf: " + listNambers.indexOf(111)); // indexOf надає нам індекс потрібного запросу, якщо ввести не існуючий
        System.out.println("indexOf: " +listNambers.indexOf(1111)); // запрос, прого видасть результат -1.

        listNambers.retainAll(listNambers2); // retainAll шукає спільні елменти в масивах
        System.out.println("retainAll: " + listNambers);

        System.out.println("Contains: " + listNambers.contains(111)); // contains виводить чи є у нас такий елемент чи нема

        listNambers.removeAll(listNambers2); // видаляє з листа доданий лист
        System.out.println(listNambers);

//          UnaryOperator <Integer> operator = new UnaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                if (integer.equals(8)) {         //  contains всі елементи з 8 заміняться на null, якщо використати equals,
//                    return null;                   // то видалить тільки елемент 8.
//                }
//                return integer;
//            }
//        };

//        listNambers.replaceAll(oprator); // replaceAll метод який змінює мої елементи по якомусь завчасно написаному правилу
    }
}
