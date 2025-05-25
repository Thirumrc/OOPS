public class INHERITANCE {
    public static void main(String[] args) {
        //single inheritance
arith1 a1=new arith1();
a1.sub(3,4);
a1.sum(1,2);
        System.out.println();
//multilevel inheritance
        arith2 a2=new arith2();
        a2.div(4,2);
        a2.sub(3,7);
        a2.sum(1,2);
        System.out.println();
 // hierarchical inhetritanc
 arith3 a3=new arith3();
 a3.mul(3,4);
 a3.sum(3,5);


 //hybrid -- combination of others

    }
}
class arithmetic{
    void sum(int a,int b){
        System.out.println(a+b);
    }

}

//single inheritance   a->b
class arith1 extends arithmetic{
    void sub(int a,int b){
        System.out.println(b-a);
    }
}

//multilevel inhritance   a->b->c
class arith2 extends arith1{
    void div(int a,int b){
        System.out.println(b/a);
    }
}

// hierarchical inheritance  a->b ,a->c
class arith3 extends arithmetic{
    void mul(int a,int b){
        System.out.println(a*b);
    }
}
