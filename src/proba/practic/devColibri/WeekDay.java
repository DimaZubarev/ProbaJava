package proba.practic.devColibri;

public class WeekDay {
    public static void main(String[] args) {

        int weekDay = (int)(Math.random()*7+1);
        if(weekDay == 1)
            System.out.println("Понеділок");
        if(weekDay == 2)
            System.out.println("Вівторок");
        if(weekDay == 3)
            System.out.println("Середа");
        if(weekDay == 4)
            System.out.println("Четверг");
        if(weekDay == 5)
            System.out.println("П'ятниця");
        if(weekDay == 6)
            System.out.println("Субота");
        if(weekDay == 7)
            System.out.println("Неділя");
        System.out.println(weekDay);
    }
}
