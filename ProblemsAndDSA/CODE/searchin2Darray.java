import java.util.Arrays;

public class searchin2Darray {
    public static void main(String[] args) {
        int [] [] arr = {
                {1,2,3,4,5,6,7,8},
                {8,7,6,5,4,3,2,10},
                {1,3,5,9,8,6,4,2},
                {8,6,4,2,1,3,5,7}
        };
        int target = 9;
        int [] ans  =  search(arr ,target); //format of return value {row,col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    static int[]  search(int [] [] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if (arr[row][col] == target){
                    return  new int[]{row,col};
                }
            }
        }
        return  new int[] {-1,-1};
    }

    static  int max(int [] [] arr){
        int Max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > Max) {
                    Max = anInt;
                }
            }
        }
        return Max;
    }

    static  int min(int [][] arr){
        int Min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < Min){
                    Min = arr[row][col];
                }
            }
        }
        return Min;
    }

}
