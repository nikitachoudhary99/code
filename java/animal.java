
class Animal {
    
         void sleep() {
            System.out.println("sleeping....");
          } 
          void eat(){
            System.out.println("eating....");
          }
         void speak(){
            System.out.println("speaking...");
         }

    }   

class Cat extends Animal{

    @Override
    void speak(){
        System.out.println("meow.. meow..");
    }
    
    void eat(){
        System.out.println("milk with toast ...");
    }
    void name(){
        System.out.println("kittu.");
    }
    void movement(){
        System.out.println("hidding or running..");
    }
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println(" bhaw... bhaw...");
    }
    void eat(){
        System.out.println("pedigree with milk..");
    }
    void movement(){
        System.out.println("running..");
    }
    void name(){
        System.out.println("sheero");
}
}
class Snake extends Animal{
     void movement(){
        System.out.println("crawlling");
     }

}
public class animal{
public static void main(String[] args) {
    Cat c=new Cat();
    c.speak();
    c.eat();
    c.name();
    c.movement();
    

    Dog d =new Dog();
    d.eat();
    d.speak();
    d.name();
    d.movement();

    Snake s=new Snake();
    s.movement();





}

}