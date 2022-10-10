import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {2,7,3,9,26,1,6};
        System.out.println("Unsorted Array : " + Arrays.toString(arr));
        selection(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    public  static void selection(int [] arr){
        for (int i = 0; i < arr.length ; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
