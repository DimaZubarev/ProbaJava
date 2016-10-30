package praktikOtAndre.generic.test8;

public class Output5 {
    public static void main(String[] args) {
        GenericsTask5<String> gs = new GenericsTask5<String>();
        gs.push("Helo");
        System.out.println(gs.pop());
    }
}
