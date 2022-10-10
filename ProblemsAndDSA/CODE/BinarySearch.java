
public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1,4,9,23,44,57,63,70,81,99};
//        int n = 10;
//        int key = 63;
//        fun(arr,n,key);

        int l=0;
        int r=9;
        int key = 63;
        fun2(l,r,key);
    }


//    public static int fun(int []arr, int n, int key){
//        int l = 0;
//        int r = n-1;
//        while (l<=r){
//            int mid = (l+r)/2;
//            if(key==arr[mid])
//                return mid;
//            else if(key<arr[mid])
//                r=mid-1;
//            else
//                l=mid+1;
//        }
//        return -1;
//    }

    public static int fun2(int l,int r,int key){
        int[] arr = {1,4,9,23,44,57,63,70,81,99};
        if(l==r){
            if (arr[l]==key)
                return l;
            else
                return -1;
        }
        else {
            int mid=(l+r)/2;
            if (key==arr[mid])
                return mid;
            else if(key<arr[mid])
                return fun2(l,mid-1,key);
            else
                return fun2(mid+1,r,key);
        }
    }
}
