package praktik_Schildt.glava3;
/*Питання:
- як рахує программа?*/
public class ThreeDMatrix {
    public static void main(String[] args) {
        int threeD[][][] = new int[3][4][5];
        int i, n, t;
        for (i = 0; i < 3; i++)
            for (n = 0; n < 4; n++)
                for (t = 0; t < 5; t++)
                    threeD[i][n][t] = i * n + t; // тут

        for (i = 0; i < 3; i++) {
            for (n = 0; n < 4; n++) {
                for (t = 0; t < 5; t++) {
                    System.out.print(threeD[i][n][t] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
