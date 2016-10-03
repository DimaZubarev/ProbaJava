package proba.practic.dzStJava;

public class StJava9 {
    public static void main(String[] args) {

        int i = 1;
        int a = 10;
//        for (i = 1; i <= 10; i++){     // считает от 1 до 10
//            System.out.print(i + " ");
//        }
//
//        System.out.println("");
//
//        for (a = 10; a >= -11; a--){  // считает от 10 до -10
//            System.out.print(a + " ");
//        }
//
//       System.out.println("");

//        while (i <= 10){
//            System.out.print(+i); // считаем от 1 до 10
//            i++;
//        }
//
//        System.out.println("");
//
//        do {
//            System.out.print(+a); // считает от 10 до 15
//            a++;
//        } while (a <= 15);
//
//        System.out.println("");

        do {
            System.out.println(+a);  // выполняет условие один раз перед проверкой
            a++;
        } while (a <= 5);
    }
}
