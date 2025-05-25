public class EXCEPTION {
    public static void main(String[] args) {
        int a=0,b=2,c=0;
        int[] arr={1,2,4};
        try {
           // System.out.println(a);
           c=b/a;
           // c=arr[6];
//sum();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("No exception");
        }
    }
    public  static void sum() throws IllegalArgumentException{
        int[] arr={1,2,4};
        System.out.println(arr[4]);
    }
}
