package praktik_Schildt.glava7_classesAndMethods.recursion.factorial;

public class Factorial {
    int fact(int n){
        if(n == 1) return 1;
        else return fact(n - 1) * n;
    }
}
