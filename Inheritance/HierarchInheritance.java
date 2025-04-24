package Inheritance;

class Base{
    void view(){
        System.out.println("This is the base class");
    }
}

class Derived extends Base{
    void show(){
        System.out.println("This is the first derived class");
    }
}

class Derived2 extends Base{
    void display(){
        System.out.println("This is the second derived class");
    }
}

public class HierarchInheritance{
    public static void main(String[] args){
        Derived obj1 = new Derived();
        Derived2 obj2 = new Derived2();

        obj1.view();
        obj1.show();

        obj2.view();
        obj2.display();
         
    }
}