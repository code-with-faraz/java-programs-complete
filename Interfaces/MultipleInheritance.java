package Interfaces;

interface Animal {
    void eat();
}

interface Venomous {
    void produceVenom();
}

interface Reptile {
    void crawl();
}

class Snake implements Animal, Venomous, Reptile {
    public void eat() {
        System.out.println("Snake eats other animals");
    }

    public void produceVenom() {
        System.out.println("Snake produces venom");
    }

    public void crawl(){
        System.out.println("Snake crawls on its belly");

    }

}

public class MultipleInheritance {
    public static final void main(String[] args) {
        Snake s = new Snake();
        s.eat();
        s.produceVenom();
        s.crawl();
    }
    
}
