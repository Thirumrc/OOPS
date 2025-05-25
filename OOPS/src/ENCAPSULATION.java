public class ENCAPSULATION{
    public static void main(String[] args) {
Person p=new Person();
p.getname("Alice");
System.out.println(p.getage(22));
p.display();
    }
}


class Person{
   private int age;
    private String name;
    public void getname(String name){
        this.name=name;
        System.out.println(name);
    }
    public int getage(int age){
        this.age=age;
        return age;
    }
//    public int setname(String name){
//        this.name=name;
//    }
    public  void display(){
        System.out.println(age);
        System.out.println(name);
    }
}
