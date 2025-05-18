class Parents {
    Parents() {
        System.out.println("Parent class constructor called.");
    }
}

class Childs extends Parents {
    Childs() {
        // super() is called implicitly
        System.out.println("Child class constructor called.");
    }
}

public class Constructorsss {
    public static void main(String[] args) {
        Childs c = new Childs();
    }
}