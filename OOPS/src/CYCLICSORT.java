import java.util.Arrays;

public class CYCLICSORT {

        public static void main(String[] args) {
            int[] arr={5,4,3,0,2,1};
            System.out.println(Arrays.toString(cylic(arr)));
        }

        private static int[] cylic(int[] arr) {
            int i=0;
            while(i<arr.length){
                  
                int c=arr[i];  //if 0 is there dont use -1  int c=arr[i];
                //  else use -1 to int c=arr[i-1]
                if(arr[i]!=arr[c])
                    swap(arr,i,c);
                else i++;
            }
            return arr;
        }
        private static void swap(int[] arr, int i, int c) {
            int t=arr[i];
            arr[i]=arr[c];
            arr[c]=t;
        }
    }



