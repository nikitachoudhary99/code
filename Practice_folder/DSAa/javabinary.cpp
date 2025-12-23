public boolean searchMatrix(int[][] arr, int target) {
    int row=arr.length();
    int col=arr[0].length();
     int s=0;
     int e=(row*col)-1;
     while(s<=e)/2;
     {
         int mid=s+(s+e)/2;
         int i=mid/col;
         int j=mid%col;

         if(arr[i][j]==target)
         {
             return true;
         }
         else if(arr[i][j]<target)
         {
             s=mid+1;
         }
         else
         {
             e=mid-1;
         }
     }
     return false;
 }
}