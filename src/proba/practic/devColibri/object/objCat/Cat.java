package proba.practic.devColibri.object.objCat;

public class Cat {

    private String name;
    private String breed;
    private String wool;
    private int age;

    public void say(){
        System.out.println("Мяв мяв");
        System.out.println("Мяяяяяяв");

    }

    @Override
    public String toString() {
        return "Кицька [Ім'я: " + name + " Порода: " + breed + " Шерсть: "  + wool + " Вік: " + age + "]";
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
