package proba.practic;

public class Main {

    public static void main(String[] args) {

        Car civic = new Honda();
        Car s2 =  new Tesla();

        Person woman = new Woman(civic);
        Person men = new Man(s2);
        Person girl = new Girl(s2);
        Person boy = new Boy(civic);

        woman.runDistance(9);
        woman.runDistance(499);
        woman.runDistance(900);
    }
}
