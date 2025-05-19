package Method_Overriding;

class Parent {
    void show(){
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show(){
        System.out.println("Child class method (Overridding)");
        super.show();
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}



