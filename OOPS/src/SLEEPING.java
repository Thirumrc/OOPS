import java.util.concurrent.TimeUnit;

public class SLEEPING {
    public static void main(String[] args) {
        for (int i = 0; i <9 ; i++) {
            System.out.println(i);
            try {
              //  System.out.println(i/0);
                Thread.sleep(2000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

}
