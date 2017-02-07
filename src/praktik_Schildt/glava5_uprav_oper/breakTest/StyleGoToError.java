package praktik_Schildt.glava5_uprav_oper.breakTest;
public class StyleGoToError {
    public static void main(String[] args) {
        one: for (int i = 0; i < 3; i++) {
                System.out.println("Прохід " + i + " : ");
            }
        for (int i = 0; i < 10; i++) {
            //if (i == 5) break one;
            // break з позначкою не можна викликати якщо він не знаходиться в томуж блоці коду
            System.out.println(i + " ");
        }
    }
}
