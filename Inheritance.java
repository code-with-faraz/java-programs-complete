class Parent{
    public void display(){
        System.out.println("Parent class");
    }
}

class Child extends Parent{
    public void view(){
        System.out.println("Child class");
    }
}

public class Inheritance{
    public static void main(String[] args){
        Child c = new Child();
        c.display();
        c.view();

      
    }
}