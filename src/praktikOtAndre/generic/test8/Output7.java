package praktikOtAndre.generic.test8;

public class Output7 {
    public static void main(String[] args) {
        GenericsTask7<String> gs = new GenericsTask7<String>();
        gs.push("Hello");
        System.out.println(gs.pop() + " ");
        GenericsTask7<Integer> gs1 = new GenericsTask7<Integer>();
        gs1.push(36);
        System.out.println(gs1.pop());
    }
}
