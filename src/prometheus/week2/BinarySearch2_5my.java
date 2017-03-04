package prometheus.week2;

public class BinarySearch2_5my {
    public static void main(String[] args) {
        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;
        int i = -1;
        int count = -1;
        for (int d : data) {
            count++;
            if(numberToFind == d){
                System.out.println(count);
            }else{
                System.out.println(i);
            }

        }
    }
}
