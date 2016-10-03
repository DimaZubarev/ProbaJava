package proba.practic.devColibri.object.objPerson;

public class Person1 {

    String firstName;
    String lastName;
    int age;
    String city;

    public Person1(String firstName, String lastName, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
