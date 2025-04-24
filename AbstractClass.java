abstract class Vehicle{
    abstract void move();
}

class Car extends Vehicle{
    void move(){
        System.out.println("The car is driving");
    }
}

class Bike extends Vehicle{
    void move(){
        System.out.println("The bike is riding");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Vehicle c = new Car();
        Vehicle b = new Bike();

        c.move(); // Output: The car is driving
        b.move(); // Output: The bike is riding
    }
}
