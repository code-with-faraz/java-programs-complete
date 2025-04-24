import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args){

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements: ");
        int sum = 0;
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];    
        }

        System.out.println("The sum of the array is: "+sum);


    }    
}

