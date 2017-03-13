package prometheus.week3.task3;

public class FibonacciVar2 {
    public long getNumber(int position) {
        if (position <= 0) return -1;
        else if (position == 1) return 1;
        else if (position == 2) return 1;
        else  return getNumber(position-1 ) + getNumber(position -2);
    }
}
class FibonacciVar2Test{
    public static void main(String[] args) {
        FibonacciVar2 sp = new FibonacciVar2();
        System.out.println(sp.getNumber(12));
    }
}


