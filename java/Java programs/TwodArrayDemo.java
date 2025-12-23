import java.util.Scanner;

class TwodArrayDemo {
    public static void main(String args[]) {
        int r, c;
        Scanner sc = new Scanner(System.in);

        // Input number of rows and columns
        System.out.print("Enter the number of rows: ");
        r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        c = sc.nextInt();

        // Initialize the 2D array
        int[][] arr = new int[r][c];
        int i, j;

        System.out.println("Enter " + (r * c) + " values for the array:");
        // Input array values
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Array:");
        // Print the original array
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        System.out.println("Reverse Array:");
        // Print the array in reverse order
        for (i = r - 1; i >= 0; i--) {
            for (j = c - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
