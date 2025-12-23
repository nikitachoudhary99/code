
public class Employee {
    String name;
    String code;
    static float sal = 10000;
    Employee(String n,String c){
        name=n;
        code=c;
    }

void showData()
{
    System.out.println( name+" /" +code);
}
    public static void main(String[] args){

    Employee e1=new Employee("aakanksha","ak47");
    Employee e2=new Employee("nikita", "nik47");
    e1.showData();
    e2.showData();

}

}