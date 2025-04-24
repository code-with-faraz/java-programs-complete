import java.util.Scanner;

public class TwoDpractice {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the 3x3 array: ");
        int sum = 0;

        // Taking input and calculating sum
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        sc.close();

        double average = (double) sum / (arr.length * arr[0].length);

        // Displaying sum and average
        System.out.println("The sum of the elements of the array is: " + sum);
        System.out.println("The average of the elements of the array is: " + average);

        // Printing the matrix
        System.out.println("The 3x3 Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // Move to the next row
        }
    }
}
// In this program, we have created a 3x3 2D array and taken input from the user for each element of the array. We have calculated the sum of all the elements and the average of the elements. Finally, we have displayed the sum, average, and the 3x3 matrix.