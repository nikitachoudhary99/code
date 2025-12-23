public class Empcount {
    String name;
    String code;
    static String company="minik";
    static float sal=50000;
    static int count =0;
    Empcount(String n,String c){
        name=n;
        code=c;
        
        count++;

    }
    void showData(){
        System.out.println(name +  "   "  +code+  "   "   +sal+  "    " + company+"    ");
        
    }
    // protected void finalize(){
    //    count--;
     //}

   public static void main(String[] args) {
    Empcount e1=new Empcount("trapti","tra101");
    Empcount e2=new Empcount("monika","mon102");
     Empcount e3=new Empcount("nikita","ni103");
    Empcount e4=new Empcount("aakanksha","ak104");
    e1.showData();
    e2.showData();
    e3.showData();
    e4.showData();

    
    
    System.out.println("total object"  + Empcount.count);

    
    


   }

    
}
