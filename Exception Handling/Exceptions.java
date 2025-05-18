public class Exceptions {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero!");
        }

        try {
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[10]); // Invalid index to trigger exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } finally {
            System.out.println("Execution complete");
        }
    }
}