public class AverageVarArg{
    
    
     static void sum(int...a){
        int sum=0;
        for(int ele:a){
        sum=sum+ele;
      }
      System.out.println("sum="  +sum);
         
    
        }
       static void avrg(int...a){
        int avrg=0;
        int sum=0;
        for(int ele:a){
            sum=sum+ele;
            avrg=sum/a.length;
        }System.out.println("avrg="  +avrg);
       }
       
    public static void main(String[] args) {
        int a[]={10,20,60,45};
        sum(a);
        avrg(a);
    }
        }

