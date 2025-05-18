class Addition{
    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void add(double a, double b){
        System.out.println(a+b);
    }
}

public class MethodOverloading{
    public static void main(String[] args){

        Addition.add(10, 23);
        Addition.add(12,32,53);
        Addition.add(23.5,12.57);
    }
}