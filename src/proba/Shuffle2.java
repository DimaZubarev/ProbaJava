package proba;

public class Shuffle2 {
    public static void main(String[] args) {
        int x =0, y = 0;
        while (x < 5){

            if (y < 5){
                x++;
                if (y < 3){
                    x--;
                }
            }
            y = y + 2;

            System.out.println(x + "" + y + " ");
            x++;
        }
    }
}
