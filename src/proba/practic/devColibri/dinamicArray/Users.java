package proba.practic.devColibri.dinamicArray;

import proba.practic.devColibri.dinamicArray.User;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Users {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>(); // сортування за ім'ям
        users.add(new User("Max", 23));
        users.add(new User("Dima", 32));
        users.add(new User("Annya", 28));

        System.out.println(users);

        Iterator<User> iterator = users.iterator(); // ітератор перебор данних
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        System.out.println("foreach");
        for (User user : users) {
            System.out.println(users);
        }
        System.out.println("");

        Iterator<User> iterator1 = users.iterator(); // видалення осіб після 25 років
        while (iterator1.hasNext()){
            if(iterator1.next().getAge() > 25) iterator1.remove();
        }
        System.out.println(users);
    }
}
