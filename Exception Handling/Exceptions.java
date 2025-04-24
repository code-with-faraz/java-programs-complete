public class Exceptions {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);

            int arr[] = { 1, 2, 3, 4, 5 };
            System.out.println(arr[10]);

        }
        catch (ArithmeticException e) {
            System.out.println("bbg you can't divide by zero");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index you are trying to access does not exist");
        }
        
        finally {
            System.out.println("Execution completed");
        }

    }
} 


