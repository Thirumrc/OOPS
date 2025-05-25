public class Generics {
    public static void main(String[] args) {
        Test<String> tt=new Test<>( "hai" );
        tt.getDetails();
        loki ll=new loki();
        ll.disp("hello");
    }
}
///generic for not defined datatype ,code reusable,user convinence

/// generic class
class Test<t>{
    t a;
    Test(t a){
        this.a=a;
        //System.out.println(a);
    }
    public void getDetails(){
        System.out.println(a);
    }
}
///generic method
class loki{
    <l>void disp(l val){
       System.out.println(val.getClass().getSimpleName()+" : "+val);
    }
    ///hai i am lokesh that's me
}
