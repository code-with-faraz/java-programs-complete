import java.util.Scanner;

public class Stringsss{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: " );
        String str = sc.nextLine(); 
        sc.close(); 

        //Getting string properties
        int length = str.length();
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(length-1);
        String uppercase = str.toUpperCase();

        //Displaying string properties
        System.out.println("The length of the string is: " + length);
        System.out.println("The first character of the string is: " + firstChar);
        System.out.println("The last character of the string is: " + lastChar);
        System.out.println("The string in uppercase is: " + uppercase);

    }
}