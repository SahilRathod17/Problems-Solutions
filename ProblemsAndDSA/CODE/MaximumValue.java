import java.util.Arrays;

public class MaximumValue {
    public static void main(String[] args) {
        int [] arr = {1,3,33,5,76,52,41};
        System.out.println(Max(arr));
        System.out.println(maxRange(arr,0,3));

    }
    static int Max(int [] arr){
        if(arr.length == 0){
            return -1;
        }
        int MaxVal = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > MaxVal) {
                MaxVal = arr[i];
            }
        }
        return MaxVal;
    }
    static int maxRange(int [] arr,int start,int end){
        if(end > start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int MaxVal = start;
        for (int i = 1; i < end; i++){
            if(arr[i] > MaxVal) {
                MaxVal = arr[i];
            }
        }
        return MaxVal;
    }
}
