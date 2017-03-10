package praktik_Schildt.glava7_classesAndMethods.boxs;

/**
 * Created by Dimon on 09.03.2017.
 */
public class DemoBox {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(10, 2, 7);
        Box cube = new Box(5);
        Box boxclone = new Box(cube);

        double var;
        var = box1.volume();
        System.out.println("Об'єм бокс1 = " + var);

        var = box2.volume();
        System.out.println("Об'єм бокс2 = " + var);

        var = cube.volume();
        System.out.println("Об'єм кубу = " + var);

        var = boxclone.volume();
        System.out.println("Об'єм боксклону = " + var);


    }
}
