abstract class animal {
    //abstract class sd
  void eat()
  {
    System.out.println("eating....");
  }  
  abstract void move();
}
class Dog extends animal{
    @Override
    void move(){
        System.out.println("running fast...");
    } 
}
public class ANIMAL2{
    public static void main(String[] args) {
        animal d=new Dog();
        d.move();
        d.eat();
    
    }
}
