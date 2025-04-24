public class MultipleTryCatch {
    public static void main(String[] args){
        try {
            int arr[] = { 1, 2, 3, 4, 5 };
            System.out.println(arr[10]); 

        }catch(ArithmeticException e){
         System.out.println("Math error bbg");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("bbg you are trying to access an element that is out of bounds");
        }
    
  }
}
