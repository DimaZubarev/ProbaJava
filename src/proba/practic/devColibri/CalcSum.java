package proba.practic.devColibri;

public class CalcSum {

    public static void main(String[] args) {

        calcSum(3, 7);
        int su = sumCalc(4, 5);
        System.out.println(su);

    }

   static void calcSum (int a, int b){
       int sum = a + b;
       System.out.println(sum);
   }

   static int sumCalc (int c, int d){
       int summa = c * d;
       return summa;
   }
}
