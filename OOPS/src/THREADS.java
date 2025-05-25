import static java.lang.Thread.sleep;

public class THREADS {
    public static void main(String[] args)  {
  Mythread m=new Mythread();///this is for extends
  m.start();

        //Thread t=new Thread(new th(),"thread nn");///giving name to the thread
       // t.start();

//  Thread th=new Thread(new th());///it will auto give thread name
//  th.start();

        Thread th1=new Thread(new th());
        th1.start();
        Thread th2=new Thread(new th());
        th2.start();
    }
}

///extends thread class
class Mythread extends Thread{
    public void run(){
        //for (int i = 0; i < 10; i++) {
            try {
int a=5/0;
                Thread.sleep(2000);
            } catch (InterruptedException e) {
              //  System.out.println(e);
                throw new RuntimeException(e);
               // System.out.println(Thread.currentThread().getName()+" hello");
            }
            System.out.println("hii");

    }
}
///implements runnable interface
class th implements Runnable{
    @Override
    public void run(){

            System.out.println(Thread.currentThread().getName()+" hello");

    }
}
