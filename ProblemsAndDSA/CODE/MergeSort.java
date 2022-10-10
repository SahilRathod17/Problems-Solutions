import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []a = {3,5,6,2,62,4,21,86,13,75,24,53};
        int lb = 0;
        int ub = a.length-1;
        System.out.println("Unsorted Array  : " + Arrays.toString(a));
        sort(a,lb,ub);
        System.out.println("Sorted  Array   : " + Arrays.toString(a));

    }
    public static void sort(int[]a,int lb,int up){
        if (lb<up){
            int mid = (lb+up)/2;
            sort(a,lb,mid);
            sort(a,mid+1,up);
            merge(a,lb,mid,up);
        }
    }

    public static void merge(int[]a,int lb,int mid,int ub){
        int[]b = new  int[a.length];
        int i = lb;
        int j = mid+1;
        int k = lb;
        while (i<=mid && j<=ub){
            if (a[i] <= a[j]){
                b[k] = a[i];
                i++;
            }
            else {
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=ub){
                b[k]=a[j];
                j++;
                k++;
            }
        }
        else {
            while (i<=mid){
                b[k]=a[i];
                i++;
                k++;
            }
        }
        for (int s = lb; s <=ub ; s++) {
            a[s]=b[s];
        }
    }
}
