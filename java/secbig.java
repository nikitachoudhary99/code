public class secbig
 {
    public static void main(String[] args) 
    { 
        int  a[]={20,50,30,40,60};
        int i,max,max1;
        max=a[0];
        max1=a[1];
        for(i=1;i<a.length;i++)
        {
            if(a[i]>max)
      {
        max=max1;
        max=a[i];
      } 
        else if(a[i]<max && a[i]>max1)
        {
            max1=a[i];
        }
    }
        
    
        System.out.println("biggest value is  "+max);
        System.out.println("secound biggest value is  "+ max1);


        
    }
    
}
