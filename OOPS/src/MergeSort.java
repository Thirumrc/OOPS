import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,6,3,1,5};
       sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void merge(int[] arr, int l,int m, int r) {
        int n1=m-l+1;
        int n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for (int i = 0; i <n1 ; ++i) {
            left[i]=arr[l+i];
        }
        for (int i = 0; i <n2 ; ++i) {
            right[i]=arr[m+1+i];
        }
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1)arr[k++]=left[i++];
        while (j<n2)arr[k++]=right[j++];
    }
    private static void sort(int[] arr,int l,int r) {
        if(l<r) {
            int m=l+(r-l)/2;
            sort(arr, l, m);
            sort(arr, m+1,r);
            merge(arr,l,m,r);
        }
    }
}
