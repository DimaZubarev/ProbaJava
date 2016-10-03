package proba.practic.devColibri.object;

import proba.practic.devColibri.object.Impl.DriverCar;
import proba.practic.devColibri.object.objCat.Cat;
import proba.practic.devColibri.object.objCat.Cat1;
import proba.practic.devColibri.object.objPerson.Men;
import proba.practic.devColibri.object.objPerson.Person;
import proba.practic.devColibri.object.objPerson.Person1;

public class Main {

    static Person person = new Person();
    static Person1 person1 = new Person1("Dima", "Zubarev", 33, "Kyiv");
    static Cat cat = new Cat();
    static Cat1 cat1 = new Cat1("Бася", "двіртер'єр", "гладкошерстна", 7);
    //static Men men = new Men("Dima", "Zubarev", 33, "Kyiv","developer", "Annka");

    public static void main(String[] args) {

        Men men1 = new Men ("Dima", "Zubarev", 33, "Kyiv", "Developer", "Anna");
        Men men2 = new Men ("Bob", "Marli", 53, "Yamayka");
        men2.setWork("Rastaman");
        men2.setWife("Amma");

        DriverCar bob = new DriverCar();
        bob.categori("B");
        bob.go();
        System.out.println(bob.getSpeed());

        cat.setName("Даша");
        cat.setBreed("двортер'єр");
        cat.setWool("волохата");
        cat.setAge(8);

        person.setFirstName("Діма");
        person.setLastName("Зубарев");
        person.setAge(33);
        person.setCity("Київ");
        person.setCat(cat);

        System.out.println(cat);
        System.out.println(person);

        System.out.println(cat1);
        System.out.println(person1);

        cat.say();
        person.getCat().say();

        System.out.println(men1);
        System.out.println(men2);



    }
}
