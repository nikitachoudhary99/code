import java.util.*;
public class bubble {
    public static void main(String args[]){
        int size;
        Scanner sc= new Scanner(System.in);

        System.out.println("enetr size");
        size=sc.nextInt();

        int arr[]=new int[size];
        int i,j,temp;
        System.out.println("enter"+size+"value");
        for(i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        for(i=1;i<size-1;i++){
            for(j=i-1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        }
        System.out.println(" array after sorting");
        for(i=0;i<size;i++){
        System.out.println(arr[i]+" ");
        }  
    }
    
}
