package proba.practic.devColibri.object.objCat;

public class Cat1 {

    private String name;
    private String breed;
    private String wool;
    private int age;

    public Cat1(String name, String breed, String wool, int age) {
        this.name = name;
        this.breed = breed;
        this.wool = wool;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat1{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", wool='" + wool + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getWool() {
        return wool;
    }

    public void setWool(String wool) {
        this.wool = wool;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
