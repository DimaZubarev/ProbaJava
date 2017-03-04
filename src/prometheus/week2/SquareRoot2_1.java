package prometheus.week2;

public class SquareRoot2_1 {
    public static void main(String[] args) {
        double a = 0;
        double b = -6;
        double c = 0;
        double x;
        double x1;
        double x2;
        if(a==0 && b ==0) {
            System.out.println("x1=");
            System.out.println("x2=");
        } else if(a==0 && c==0){
            x1 = x2 = 0.0;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else if(a==0){
            System.out.println("x1=");
            System.out.println("x2=");
        }else  if(c==0){
            x1 = x2 = 0.0;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }else{
            double d = (b * b) - 4 * a * c;
            if (d > 0) {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            } else if (d == 0) {
                x = -b / (2 * a);
                System.out.println("x1=" + x);
                System.out.println("x2=" + x);
            } else {
                System.out.println("x1=");
                System.out.println("x2 =");
            }
        }
    }
}
