package praktik_Schildt.glava7_classesAndMethods.recursion.moreRecursion;
public class Recursion2 {
    int values[];

    public Recursion2(int i){
        values = new int[i];
    }
    void printArray(int i){
        if(i == 0)return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}
