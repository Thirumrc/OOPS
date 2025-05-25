public class
Abstraction {
    public static void main(String[] args) {
dog d=new dog();
d.sound();
d.ss();

        System.out.println();

        //interface
nonpets n=new nonpets();
n.dog();
n.cat();
        System.out.println();
  pets p=new nonpets();                   //upsacling
  p.dog();
  p.cat();

        System.out.println();
//multiple inheritance
    sanju ss=new sanju();
    ss.dog();
    ss.kks();
    ss.cat();
    ss.jana();

    }
}
 abstract class animal{
      abstract void sound();

     void ss(){
        System.out.println("haii");
    }
}
class dog extends animal{


    void sound() {
        System.out.println("hello");

    }
    // now the mehod ss is overidden
    void ss(){
        System.out.println("bye");
        super.ss();   //this keywoard is used to call the overriden method in the parent class. this is calld as upscaling
    }
}


 interface pets{

   default void cat(){
        System.out.println("meeow");
    }
     void dog();
 }
 class nonpets implements pets{
     @Override
     public void dog() {
         System.out.println("zzzzz");
     }

 }


 interface p{
  default void jana(){
      System.out.println("aii");
  }
  void kks();
 }
 class sanju implements pets,p{
     @Override
     public void kks() {
         System.out.println("kks");
     }

     @Override
     public void dog() {
         System.out.println("dog");
     }
 }