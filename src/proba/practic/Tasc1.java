package proba.practic;

public class Tasc1 {
    public static void main(String[] args) {

        String str = "10";
        try {
            Byte b1 = new Byte("12");
            System.out.println(b1);
        }
            catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }

        String str1 = "111";
        try {
            Byte b2 = Byte.valueOf(str1);
            System.out.println(b2);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }

        byte b3 = 0;
        String str2 = "100";
        try {
            b3 = Byte.parseByte(str2);
            System.out.println(b3);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
    }
}
