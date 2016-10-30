package proba.practic.devColibri.dinamicArray;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {
    public static void main(String[] args) {

        Set<String>set = new HashSet<>();

        set.add("item");
        set.add("item1");
        set.add("item");
        System.out.println(set);

        Set<User> users = new HashSet<>();

        users.add(new User("Dima", 32));  // При введенні 3 юзерів, 2 з яких однакові программа нам видясть 3 юзера, щоб
        users.add(new User("Annya", 28)); // программа працювала вірно, в классі юзер потрібно реалізувати иклс и хешкод.
        users.add(new User("Dima", 32));  // Тоді сет працює як потрібно і видає тільки унікальних юзерів
        System.out.println(users);



    }
}
