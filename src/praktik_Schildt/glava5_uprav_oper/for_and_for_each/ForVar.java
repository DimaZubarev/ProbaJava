package praktik_Schildt.glava5_uprav_oper.for_and_for_each;

public class ForVar {
    public static void main(String[] args) {
        int i = 0;
        boolean done = false;
        for (;!done;) {
            System.out.println("i = " + i);
            if (i == 10) done = true;
            i++;
        }
    }
    // цикл працює поки і не буде дорівнювати 10 і !done не стане - false;
}
