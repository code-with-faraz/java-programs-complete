class CustomException extends Exception {
    CustomException(String msg) {
        super(msg);
    }
}

public class UserDefinedException {
    static void validate(int age) throws CustomException {
        
        if (age < 18)
            throw new CustomException("Not eligible to vote");
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}