package proba.practic.devColibri.dinamicArray;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>(); // в queue всі елементи стоять в черзі (як в чергу стали, так і виходять), використовуєдтся рідко

        queue.add("item1");
        queue.add("item2");
        queue.add("item3");
        queue.add("item4");
        queue.add("item5");

//        System.out.println(queue.element()); // видає перший елемент з черги

//        queue.remove();                      // видаляє перший елемент з черги
//        System.out.println(queue.element()); // видає другий елемент з черги
        System.out.println(queue.peek());    // якщо в нашій черзі є елементи peek видає перший елемент, якщо наша черга порожня видае null
        System.out.println(queue.poll());    // достає з черги елемент, показує його і після цього видаляє його
        System.out.println(queue.peek());

    }
}
