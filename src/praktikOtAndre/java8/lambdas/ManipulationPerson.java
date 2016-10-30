package praktikOtAndre.java8.lambdas;

import java.util.ArrayList;
import java.util.List;

public class ManipulationPerson {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Dima", 32));
        persons.add(new Person("Anna", 28));
        persons.add(new Person("Denis", 12));
        persons.add(new Person("Petr", 5));
        persons.add(new Person("Alex", 62));
        persons.add(new Person("Vika", 18));

        // method Java 7
        int summ = 0;
        int quantity = 0;
        for(Person p : persons){
            if(p.getAge() >= 18)
                summ += p.getAge();
        quantity ++;}
        double averageAge = (double) summ/quantity;
        System.out.println("averageAge = " + averageAge);

        // method Java 8
        double averageAge2 = persons.stream().
                mapToInt(p -> p.getAge()).average().getAsDouble();
        System.out.println("averageAge2 = " + averageAge2);

        // method Java 7
        //for (Person p : persons) System.out.println(p);

        // method Java 8
        persons.stream().
                //filter(person -> {return person.getAge() >= 18;}). // version 1
                filter (p -> p.getAge() >= 18 && p.getAge() <= 50). // version 2

                //sorted ((persons1, persons2) -> persons1.getName().compareTo(persons2.getName())). // version 1
                sorted((p1, p2) -> p1.getName().compareTo(p2.getName())). // version2

                //map(p -> p.getName()).
                //map(p -> p.getAge()).
                // виводить ім'я або вік

                // forEach(person -> System.out.println(person)); // version 1
                // forEach(p -> System.out.println(p)); // version 2
                forEach(System.out::println); // version 3

    }
}