public class FinallyKeyword {
    public static void main(String[] args) {
        try {
            int num = 20 / 4; 
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Math error bbg");

        } finally {
            System.out.println("There were no errors in here");
        }
    }
}