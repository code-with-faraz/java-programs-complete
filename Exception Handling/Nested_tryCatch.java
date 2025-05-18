public class Nested_tryCatch {
    public static void main(String[] args){
        try{
            
            try{
                int arr[] = {1,2,3,4};
                System.out.println(arr[10]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index is out of bounds");
            }
            
            int result = 10/0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }finally{
            System.out.println("Executed successfully");
        }
    }
}
