package proba.practic.devColibri;

public class Logic1 {
    public static void main(String[] args) {
        int x = 3;
        //Якщо свіч поставити після іф він не буде працювати
        switch (1) {
            case 1:
                System.out.println("Знову понеділок ((");
                break;
            case 2:
                System.out.println("Вівторок (");
                break;
            case 3:
                System.out.println("Середа - середина неділі");
                break;
            case 4:
                System.out.println("Четверг )");
                break;
            case 5:
                System.out.println("Яху, п'ятниця");
                break;
        }
        if (x==3){System.out.println("х равен 3");}
        else{System.out.println("х не равен 3");}
        System.out.println("Эта строка выполняется в любом случае");}


    }

