import java.util.Arrays;

public class BullbeSort {
    public static void main(String[] args) {
        int[] arr={4,3,5,2,1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }

        }
        System.out.println(arr[arr.length-3]);
        System.out.println(Arrays.toString(arr));
    }
}

