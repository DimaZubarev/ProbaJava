package proba.practic.devColibri.object.objPerson;

import proba.practic.devColibri.object.objCat.Cat;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String city;
    private Cat cat;

    @Override
    public String toString() {
        return "Person [Ім'я: " + firstName +  " Призвище: " + lastName + " Вік: " + age + " Місто: " + city + " Має кицьку: " + cat + "]";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
