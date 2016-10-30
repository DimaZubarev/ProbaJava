package praktikOtAndre.generic.test8;

public class Output6 {
    public static void main(String[] args) {
        GenericsTask6<Integer> gs = new GenericsTask6<Integer>();
        gs.push(36);
        System.out.println(gs.pop());
    }
}
