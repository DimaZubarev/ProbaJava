package proba.practic.devColibri;

public class Сycle {

    public static void main(String[] args) {

        int i3 = 3;
        int i4 = 1;
        String [] str = {"Hello", "Big", "World"};
        String[] stri = "Hello Big World".split(" "); // Не розумію, що за  .split(" ")
        // ot 0 do 5
        for(int i1 = 0; i1 <= 5; i1++){
            System.out.print(i1);
        }
        System.out.println("");

        // ot 5 do 0
        for(int i2 = 5; i2 >= 0; i2-- ){
            System.out.print(i2);
        }
        System.out.println("");

        //Буде виводитись доки і3 не зрівняється з 0
        while (i3 > 0){
            System.out.println("I`m small i3");
            i3--;
        }
        System.out.println("");

        //Буде виводитись доки і4 не зрівняються
        while(i4 < 4){
            System.out.println("I`m big i4");
            i4++;
        }
        System.out.println("");

        //Метод форич з масивами 1вар
        for(String s : str){
            System.out.println(s);
        }
        System.out.println("");

        //Метод форич з масивами 2вар - поки не розумію, що за  .split(" ")
        for(String t : stri){
            System.out.println(t);
        }

    }
}
