public class jaggedArray {
   public static void main(String[] args) { 
        int a[][] = {
            {10, 20, 30},
            {20, 40},
            {10}
        };

        for (int[] arr : a) {
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

      
        System.err.println("Biggest element in each row:");
        for (int i = 0; i < a.length; i++) {  
            int max = a[i][0];  

            
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];  
                }
            }

         
            System.out.println("Row " + (i + 1) + " largest: " + max);
        }
    } 
}
