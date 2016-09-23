package proba.practic;

public class BreakDemo {

    public static void main(String[] args) {

        //Строка для пошуку
        String searcMe = "Мама мила раму"; // ім'я змінної шукай мене

        //Визначаємо довжину речення
        int max = searcMe.length();

        //Символ, який ми шукаємо
        char symb = 'н';

        //Перемикач знайдено / не знайдено
        boolean find = false;

        for (int i = 0; i < max; i++) {
            //Якщо символ на позиції  і в строчці дорівнює шукаємому символу
            if (searcMe.charAt(i) == symb) {

                //переключаємо в режим занайдено та виходимо
                find = true;
                break;
            }
        }

        //Виводимо повідомлення
        if (find){System.out.println("Символ '" + symb + "' найдено");}
        else {System.out.println("Символ '"+ symb +"' не знайдено");}




    }
}
