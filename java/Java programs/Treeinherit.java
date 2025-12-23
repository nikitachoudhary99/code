
    class Animal{
        void eat(){
            System.out.println("eating");
        }
        void sleep(){
            System.out.println("sleeping");
        }
        void name(){
            
            System.out.println("name");
        }

    }
    class Dog extends  Animal{
       static void bark(){
            System.out.println("barking.....");
        }
    }
    class Cat extends Animal{
        void meow(){
            System.out.println("meow....");
        }
    }
    public class Treeinherit {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        System.out.println("Dog");
        d.bark();
        d.eat();
        d.sleep();
        d.name();
        Cat c=new Cat();
        c.meow();
        c.eat();
        c.sleep();
        c.name();




    }
    
}
