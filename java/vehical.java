
    class Vehicle {
        
        public void move() {
            System.out.println("Vehicle is moving");
        }
    }
    
   
    class Car extends Vehicle {
       
        @Override
        public void move() {
            System.out.println("Car is driving on the road");
        }
    }
    
 
    class Bike extends Vehicle { 
       
        @Override
        public void move() {
            System.out.println("Bike is riding on the road");
        }
    }
    

    class Truck extends Vehicle {
     
        @Override
        public void move() {
            System.out.println("Truck is hauling goods on the highway");
        }
    }
    
    public class vehical{
        public static void main(String[] args) {
           
            Vehicle vehicle = new Vehicle();
            Vehicle car = new Car();
            Vehicle bike = new Bike();
            Vehicle truck = new Truck();
    
            vehicle.move(); 
            car.move();     
            bike.move();   
            truck.move();   
        }
    }
    
    

