package praktik_Schildt.glava3;

/**
 * Created by Dimon on 13.01.2017.
 */
public class TwoDAgain {
    public static void main(String[] args) {
        int[][]twoD = new int[4][];
        twoD[0]= new int[1];
        twoD[1]= new int[2];
        twoD[2]= new int[3];
        twoD[3]= new int[4];
        int count = 0;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < i+1; j++) {
                twoD[i][j]=count; // як зрозуміти цю строку?
                count++;
            }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(twoD[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
