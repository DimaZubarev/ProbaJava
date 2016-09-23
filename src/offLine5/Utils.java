package offLine5;

/**
 * Created by Dimon on 19.09.2016.
 */
public class Utils {

    public static String removeChar(char letter, String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != letter) {
                result += text.charAt(i);
            }
        }
        return result;
    }

    public static String removeChar2(char letter, String text) {
        String result = "";
        String[] split = text.split("");
        for (String c : split) {
            if(!c.equals("" + letter)){
                result += c;
            }
        }
        return result;
    }


}