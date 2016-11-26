package testCore.question6;

public class DogShow {
    public static void main(String[] args) {
        new DogShow().go();
    }

    void go() {
        new Hound().bark();
        ((Dog) new Hound()).bark();
 //       ((Dog) new Hound()).sniff();
    }
    public double sqr(double arg) { int k = 1; return k; }
}
