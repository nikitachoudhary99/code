abstract class animalll{ 
     void eat()
     {
      System.out.println("Eating...");
     }
     abstract void move();
     
    
}
class Dog extends animalll{
     @Override
     void move(){
          System.out.println("running fast...");
     }

}
public class inherit{
     public static void main(String[] args) {
         animalll a=new Dog();
         a.eat();
         a.move();
     }
}
