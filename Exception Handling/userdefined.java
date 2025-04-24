class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}

public class userdefined {
    static void validate(int age) throws CustomException{
        if(age<18)
        throw new CustomException("Not eligible");
        System.out.println("Eligible");
    }

    public static void main(String[] args){
        try{
            validate(20);
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
    
}