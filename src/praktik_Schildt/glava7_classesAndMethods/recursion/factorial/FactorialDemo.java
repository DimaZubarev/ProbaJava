package praktik_Schildt.glava7_classesAndMethods.recursion.factorial;
class FactorialDemo{
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Факторіал 3 = " + factorial.fact(3));
        System.out.println("Факторіал 5 = " + factorial.fact(5));
        System.out.println("Факторіал 8 = " + factorial.fact(8));
    }
}
