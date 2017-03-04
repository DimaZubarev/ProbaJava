package prometheus.week2;

public class BinarySearch2_5 {
    public static void main(String[] args) {
        // Бінарний пошук
        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;
        int i = -1;
        if(data != null){
            int low =0;
            int high = data.length;
            int mid;
            while(low<high){
                mid = (low + high)/2;
                if(numberToFind == data[mid]){
                    i = mid;
                    break;
                }else{
                    if(numberToFind < data[mid]) high = mid;
                    else low = mid +1;
                }
            }
            System.out.println(i);
        }
    }
}
