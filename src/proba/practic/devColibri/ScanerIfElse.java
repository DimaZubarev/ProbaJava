package proba.practic.devColibri;

import java.util.Scanner;

public class ScanerIfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = scan.nextInt();
        scan.close();
        if(a < 0)
            System.out.println(a + " < 0");
        else if(a > 0)
            System.out.println(a + " > 0");
        else if(a == 0)
            System.out.println("a == 0");

    }

}
