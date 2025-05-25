import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 4, 6, 3, 1, 5};
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;

                }
            }}
            System.out.println(Arrays.toString(arr));

    }
}