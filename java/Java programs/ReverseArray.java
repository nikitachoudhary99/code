import java.util.Scanner;
class ReverseArray
{
  public static void main(String args[])
{
  int n ,i;
  Scanner sc= new Scanner(System.in);

System.out.println("enter n");
n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter "+n+ "value");
for(i=0;i<n;i++)
{
 arr[i]=sc.nextInt();
}  

int start=0;
int end=n-1;
while(start<end){
int temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
start++;
end--;

}
for(i=0;i<n-1;i++){
 System.out.print(arr[i]+ " ");
}
}
 
}