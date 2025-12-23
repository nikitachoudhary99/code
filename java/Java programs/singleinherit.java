class A{
    void show(){
        System.out.println("i am from a class");
    }
}
class B extends A{
    void show1(){
        System.out.println("i am from base class");
    }
}

 
public class singleinherit {
    public static void main(String[] args) {
        A a=new A();
        a.show();
        B b=new B();
        b.show();


    }
    
}
