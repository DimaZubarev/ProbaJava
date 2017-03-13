package prometheus.week3.task3;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    long n1 = 1, n2 = 0, result;
    public long fib(){
        result = n1 + n2;
        n1 = n2;
        n2 = result;
        return result;
    }

    public long getNumber(int position) {
        if(position == fib() ) return -1;
        else if(position == 0) return -1;
        else
     return 0;
    }
}
class Demo{
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        int i =0;
        while (i< 10){
            System.out.print(fibo.fib() + " ");
            i++;

        }
    }
}
