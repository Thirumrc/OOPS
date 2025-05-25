public class POLYMORPHISM {
    public static void main(String[] args) {
       // POLYMORPHISM p=new POLYMORPHISM();
        Arith d=new Arith();
        d.sum();
       d.sum(3,4);
        System.out.println(d.sum(2,3,4));
        System.out.println();
      // upsacling  --common methods will be called   in sub class
       Math ani=new Arith();
       ani.sum();
        System.out.println(ani.sum(3,4,7));//this will not be executed
    }

}
class Math{
    public void sum(){
        System.out.println("hello");
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
}
class Arith extends Math{
    public void sum(){   //overridden
        System.out.println("hai");
    }
    public void sum(int a,int b){
        System.out.println(a+b);
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
}
