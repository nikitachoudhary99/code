
import java.util.Scanner;

public class two{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();

    int arr[][] = new int[size][size];

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println("enter arry value");
            arr[i][j]=sc.nextInt();
        }
    }
     for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[i][j]);
        }
    }


    }
}