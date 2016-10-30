package proba.practic.devColibri;

public class Massiv {

    static int[] numbers1 = new int[5];
    static double[] numbers2 = {1.3, 2.5, 3.7, 4.9, 5.1, 6.5, 7.7, 8.8, 9.9, 10.0};

    public static void main(String[] args) {

//        numbers1[0] = 1;
//        numbers1[1] = 5;
//        numbers1[2] = 7;
//        numbers1[3] = 3;
//        numbers1[4] = 8;

//        for (int n : numbers1){ // пробігаємо по масиву
//            System.out.println("Вивод данних: " + n);
//        }

//        System.out.println("");

//        for(int i = 0; i < numbers2.length; i++){ // пробігаємо по масиву
//            System.out.println("Індекс: " + i + " : " + "вміст ячейки пам'яті " + numbers2[i]);
//        }

//        int[] masivArray = new int[4];
//        for (int i = 0; i < masivArray.length; i++)
//            System.out.println("masivArray[i]" + masivArray[i]);

//        System.out.println("Число з масиву numbers2 по індексу: " + numbers2[5]);
//        System.out.println("Довжина масиву numbers2: " + numbers2.length);

        for (double balance: numbers2) {
            if(balance > 5.0)
                System.out.println("You winner " + balance);
        }
    }
}
