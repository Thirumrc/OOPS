//import static java.util.Collections.swap;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,6,3,1,5};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quick(int[] arr, int low, int high) {
        if(low<high){
            int m=sort(arr,low,high);
            quick(arr,low,m-1);
            quick(arr,m+1,high);
        }
    }

    private static int sort(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for (int j = low; j <high ; j++) {
            if(arr[j]<=pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
          return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
