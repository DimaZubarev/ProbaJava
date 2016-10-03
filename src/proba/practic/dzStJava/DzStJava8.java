package proba.practic.dzStJava;

// Даны 4 числа типа int.
// Сравнить их и вывести наименьшее на консоль.
//Сравнить их и вывести наибольшее на консоль.
//Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.
//Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.


public class DzStJava8 {

    public static void main(String[] args) {

        int a = 1, b = 5, c = 3, d = 9;
        String name1 = "Dima";
        String name2 = "Alex";

        if (name1 == name2) {
            System.out.println("Мы тески");
        } else {
            System.out.println("Мы не тески");
        }

        if (d > c) {
            if (c < b) {
                if (b > a) {
                    System.out.println(a);
                }
            }
        }

        if (a < b) {
            if (b > c) {
                if (c < d) {
                    System.out.println(d);
                }
            }
        }

        int seson = 3;
        String sesonString;
        switch (seson) {

            case 1:
                sesonString = "Зима";
                break;
            case 2:
                sesonString = "Весна";
                break;
            case 3:
                sesonString = "Лето";
                break;
            case 4:
                sesonString = "Осень";
                break;
            default:
                sesonString = "Ошибка";
                break;
        }
        System.out.println(sesonString);
    }
}
