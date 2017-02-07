package praktik_Schildt.glava3;
public class TwoDArray {
    public static void main(String[] args) {
        int[][]twoD = new int[4][5];
        int count = 0;
        // цей формує?
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 5; j++) {
                twoD[i][j] = count;
                count++;
            }
            // цей роздруковує?
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twoD[i][j]);
            }
            System.out.println();
        }

    }
}
