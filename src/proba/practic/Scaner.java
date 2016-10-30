package proba.practic;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        System.out.println("Введіть число");
//        int i = scan.nextInt();              // також е nextDouble
//        System.out.println("Введіть число");
//        int n = scan.nextInt();              // закриває процес
//        scan.close();
//        System.out.println("Сумма дорівнює " + (i + n));

//        System.out.println("Введіть число");
//        int t = - scan.nextInt();
//        scan.close();
//        System.out.println("Число дорівнює" + t);

//        System.out.println("Введіть слово");
//        String str1 = scan.next();         // next зчитує строку до першого пробілу. nextLine зчитує всю введену строку
//        scan.close();
//        System.out.println("І це слово: " + str1);

        System.out.println("Введіть число");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int min;
        scan.close();

        if(a < b){
            min = a;
        System.out.println("Min = " + min);}
        if(a > b){
            min = b;
        System.out.println("Min = " + min);}
        if(a == b) System.out.println("a == b");



//


    }
}
