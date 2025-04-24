// Base interface for all animals
interface Animal {
    void eat();
}

interface Bird extends Animal{
    void fly();
}

class Sparrow implements Bird{
    public void eat(){
        System.out.println("Sparrow eats insects and grains.");
    }

    public void fly(){
        System.out.println("Sparrow flies in the sky.");
    }
}

public class ExtendingInterface {
    public static void main(String[] args) {

        Sparrow s = new Sparrow();
        s.eat();
        s.fly();
    }
}