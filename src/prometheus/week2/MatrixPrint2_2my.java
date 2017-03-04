package prometheus.week2;

public class MatrixPrint2_2my {
    public static void main(String[] args) {
        for (int i = 1; i <=25 ; i++) {
            if(i == 1) {
                System.out.print(" *  ");
            continue;
            }
            if(i == 5) {
                System.out.println("* ");
                continue;
            }
            if(i == 7) {
                System.out.print("* ");
                continue;
            }
            if(i == 9) {
                System.out.print("* ");
            continue;
            }
            if (i == 10) {
                System.out.println(i + " ");
                continue;
            }
            if (i == 13) {
                System.out.print("* ");
                continue;
            }
            if (i == 15) {
                System.out.println(i + " ");
                continue;
            }
            if (i == 17) {
                System.out.print("* ");
                continue;
            }
            if (i == 19) {
                System.out.print("* ");
                continue;
            }
            if (i == 20) {
                System.out.println(i + " ");
                continue;
            }
            if (i == 21) {
                System.out.print("* ");
                continue;
            }
            if (i == 25) {
                System.out.print("* ");
                continue;
            }

            System.out.print(i + " ");
        }
    }
}
