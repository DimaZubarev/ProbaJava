package praktik_Schildt.glava5_uprav_oper;

public class Switch1 {
    public static void main(String[] args) {
        int month = 5;
        String seasson;
        switch (month){
            case 12:
            case 1:
            case  2:
                seasson = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                seasson = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                seasson = "Літо";
                break;
            case 9:
            case 10:
            case 11:
                seasson = "Осінь";
                default:
                    seasson = "я навіть незнаю такого сезона";
        }
                    System.out.println("Зараз на вулиці " + seasson);
    }
}
