public class employeesel {
 String name;
 float bs;
float Da=0.30f;
float pf=0.17f;
float Hra=0.50f;
static float netsal;
 employeesel(String name, float bs) {
       this.name=name;
       this.bs=bs;
       }
       void showData(){
        System.out.println(name+ " " +bs+" " +Da+ " " +Hra+" ");
        netsal=bs+(Da*bs)+(Hra*bs)-(pf*bs);
        System.out.println("netsalary ="+netsal);

       }



    public static void main(String[] args) {
        employeesel e1=new employeesel("aakanksha",10000);
        employeesel e2=new employeesel("nikita",11000);
        e1.showData();
        e2.showData();
        System.out.println("net salary=" +netsal);
    }
    
}
