package praktik_Schildt.glava5_uprav_oper.for_and_for_each;

public class FindPrime {
    public static void main(String[] args) {
        int num = 2;
        boolean isPrime;

        if (num < 2) isPrime = false;
        else isPrime = true;
        //System.out.println(isPrime);
        for (int i = 2; i <= num/i; i++){
            if ((num % i) == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Просте число");
        else System.out.println("Не просте число");
        //Тільки 2 спрацьовує як просте число, всі інші, як  не просте число

    }
}
