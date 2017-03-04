package prometheus.week2;

public class MatrixPrint2_2var2 {
    public static void main(String[] args) {
        int c = 0;
        for (int i = 1; i <=25 ; i++) {
            if (i == 1 || i == 5 || i == 7 || i == 9 || i == 13 || i == 17 || i ==19 || i == 21 || i == 25) {
                System.out.print(" * ");
                c++;
            }
            else if (i < 10) {
                System.out.print(" " + i + " ");
                c++;}
            else {
                System.out.print(i+ " ");
                c++;}
            if (c % 5 == 0) System.out.println();
        }
    }
}
