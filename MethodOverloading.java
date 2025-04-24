class Addition{
public void add(int a, int b){
    System.out.println(a+b);
}

public void add(int a, int b, int c){
    System.out.println(a+b+c);
}


public void add(double a, double b){
    System.out.println(a+b);
 }
} 

public class MethodOverloading {
    public static void main(String[] args){
        Addition a = new Addition();

        a.add(10, 20);
        a.add(10, 20, 30);
        a.add(10.5, 20.5);      
        
    }
}
