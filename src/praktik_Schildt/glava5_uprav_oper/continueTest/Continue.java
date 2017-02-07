package praktik_Schildt.glava5_uprav_oper.continueTest;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0)continue;
            // якщо число парне то continue передає управління знову на for і не дає перевезти строку
            System.out.println();
        }
    }
}
