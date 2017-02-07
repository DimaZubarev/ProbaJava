package praktik_Schildt.glava5_uprav_oper.breakTest;

public class StyleGoTo2 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Прохід " + i + ": ");
            for (int j = 0; j < 20; j++) {
                if (j == 10) break outer; // вихід з обох циклів
                System.out.print(j + " ");
            }
            System.out.println("Це ніколи не виконається");
        }
        System.out.println();
        System.out.println("Цикли завершино");
    }
}
