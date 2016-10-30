package praktikOtAndre.java8.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
        Function<String, Integer> toInteger = n -> Integer.valueOf(n);
        Function<String, Integer> toInteger1 = Integer::valueOf; // :: metod reference -> lambda expression
        toInteger.apply("123");

        List<Person> persons = new ArrayList<>();
        persons.add(new Person(10, "doctor"));
        persons.add(new Person(11, "driver"));
        persons.add(new Person(21, "policmen"));
        persons.add(new Person(22, "firemen"));

//        Function<Person, Job> mapPersonToJob = new Function<Person, Job>() {
//            @Override
//            public Job apply(Person person) {
//                return new Job(person.getPersonId(), person.getJobDescription());
//            }
//        };

        List<Job> jobs = persons.stream()
                .filter(isAdultMale())
                .map(p -> new Job (p.getPersonId(), p.getJobDescription()))
                .collect(Collectors.toList());
        System.out.println(jobs);
    }
    public static Predicate<Person> isAdultMale(){
            return p -> p.getPersonId() < 21 && !p.getJobDescription().equalsIgnoreCase("Test");
    }
}
