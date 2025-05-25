import java.util.Arrays;

public class bbb {
    public static void main(String[] args) {
        int[]arr={4,2,1,3};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length-1-i ; j++) {
                if(arr[i]>arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
