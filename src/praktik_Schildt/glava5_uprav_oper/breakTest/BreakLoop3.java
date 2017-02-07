package praktik_Schildt.glava5_uprav_oper.breakTest;
public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.print("Строка " + i + " : ");
            for (int j = 0; j < 50; j++) {
                if (j == 20)break;
                System.out.print(j + " ");
            }
            System.out.println();
            if (i == 5)break;
        }
        System.out.println("Цикл завершино");
    }
}
