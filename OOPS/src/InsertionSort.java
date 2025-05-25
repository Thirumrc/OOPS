import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,6,3,1,5};
        for (int i = 0; i < arr.length ; i++) {
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int t=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=t;j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
