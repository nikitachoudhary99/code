public class big
 {
    public static void main(String[] args) 
    { 
        int  a[]={20,50,30,40,50};
        int i,max;
        max=a[0];
        for(i=1;i<a.length;i++)
        if(a[i]>max)
        max=a[i];
        System.out.println("biggest value is  "+max);
        
    }
    
}
