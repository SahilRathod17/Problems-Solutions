import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};
        //System.out.println(linearsearch(arr,7));
        //System.out.println(linearsearch2(arr,57));
        String str = "Sahil";
        //System.out.println(search(str,'S'));
        //System.out.println(searchrange(arr,6,0,5));
        System.out.println(min(arr));
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    static  int linearsearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length ; index++) {
            int elemnet = arr[index];
            if(elemnet ==  target){
                return  index;
            }
        }
        return -1;
    }
    static boolean linearsearch2(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }
        for (int elemnet : arr) {
            if (elemnet == target) {
                return true;
            }
        }
        return false;
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
//        for (int i = 0; i < str.length(); i++) {
//            if(target==str.charAt(i)){
//                return true;
//            }
//        }
        for (char ch: str.toCharArray()
             ) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }

    //Search in range
    static  int searchrange(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end ; index++) {
            int elemnet = arr[index];
            if(elemnet ==  target){
                return  index;
            }
        }
        return -1;
    }

    //Minimum number
    //here assume array is not empty arr.length =! zero
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans ){
                ans = arr[i];
            }
        }
        return ans;
    }
}
