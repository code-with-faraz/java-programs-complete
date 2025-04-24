package Inheritance;

class GrandParent{
    void here(){
        System.out.println("This is the grandparent class");
    }
}

class Parent extends GrandParent{
    void display(){
        System.out.println("This is the parent class");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("This is the child class");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args){
        Child obj = new Child();

        obj.here();
        obj.show();
        obj.display();
    }
}