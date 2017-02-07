package praktik_Schildt.glava5_uprav_oper;

public class If_else_if {
    public static void main(String[] args) {
        int month = 5;
        String seasson;
        if (month == 12 || month == 1 || month == 2)
            seasson = "Зима";
        else if (month == 3 || month == 4 || month == 5)
            seasson = "Весна";
        else if (month == 6 || month == 7 || month == 8)
            seasson = "Літо";
        else if (month == 9 || month == 10 || month == 11)
            seasson = "Осінь";
            else
                seasson = "Такого місяця неіснує";
        System.out.println("Травень це - " + seasson);

    }
}
