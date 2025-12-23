
//only even of sum elements print 
public class EvenSum {
  public static void main(String[] args) {
      int[] a = {10, 25, 35, 40, 50}; 
      int sum = 0;
      
      System.out.println("Array elements are:");
      for (int ele : a) {
          System.out.print(ele + " ");
      }
      System.out.println();  
      
    
      for (int ele : a) {
          if (ele % 2 == 0) {
            System.out.println("even elements" +ele);
              sum = sum + ele;
          }
      }
      
      System.out.println("Sum of even elements: " + sum);  
  }
}
