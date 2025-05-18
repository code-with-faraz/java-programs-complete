package Inheritance;

class Parent{
    static void show(){
        System.out.println("This is the parent class");
    }
}

class Child extends Parent{
    static void display(){
        System.out.println("This is the child class");
    }
}

public class SingleInheritance {
    public static void main(String[] args){
        Child.show();
        Child.display();
    }
}

