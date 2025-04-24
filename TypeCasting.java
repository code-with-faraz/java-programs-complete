public class TypeCasting {
    public static void main(String[] args){

        //Implicit casting (Widening)
        int num = 100;
        double d = num;
        System.out.println("Example of Implicit Casting: " + d);


        //Explicit casting (Narrowing)
        double d1 = 100.04;
        int num1 = (int)d1;
        System.out.println("Example of Explicit Casting: " + num1);

    }
    
}
