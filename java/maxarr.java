public class maxarr {
    static void addition(int ...a)
    {
        int i= a.length;
        int max=a[0];
        
        for(int arr:a){
            if(arr<max){
            max=arr;
            i++;
            }

        }
        System.out.println("max"+max);
    }
    public static void main(String[] args) {
        int a[]={3,20,40,50};
        addition(a);

    }
    
}
