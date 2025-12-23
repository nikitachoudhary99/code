public class minTwoDArray 
{public static void main(String[] args)
     {
        int a[][]={
            {1,2,3,4},
            {1,4,8,9},
            {9,8,7,5}
            };
            
    int i,j;
    System.out.println("elements of 2D array");
    for(i=0;i<=2;i++)
    {
        for(j=0;j<=3;j++)
        {
            System.out.println(a[i][j] + "");
            System.out.print("\t");
        }
    }
    //minimun
    System.out.println("\nminimum element in each row:");
         for (i = 0; i < 4; i++) {
             int rowMin = a[i][0];  
             for (j = 1; j < 3; j++) {
                 if (a[i][j] < rowMin) {  
                     rowMin = a[i][j];  
                 }
             }
             System.out.println("Minimum element in row " + (i + 1) + ": " + rowMin); 
         }
 
         
         System.out.println("\nMinimum element in each column:");
         for (i = 0; i < 3; i++) {
             int colMin = a[0][i];  
             for (j = 1; j < 4; j++) {  
                 if (a[j][i] < colMin) {  
                     colMin = a[j][i];  
                 }
             }
             System.out.println("Minimum element in column " + (i + 1) + ": " + colMin);  
         }
    }
    
}
