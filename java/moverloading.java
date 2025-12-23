public class moverloading {
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void add(float a,float b){
        System.out.println(a+b);
    }
    static void add(char a,char b){
        System.out.println(a+b);
    }
    static void add(float a,int b){
        System.out.println(a+b);
    }
   public static void main(String[] args) {
    add(10,20);
    add(20,30,40);
    add(2.2f,50.2f);
    add('a','b');
    add(20.9f,20);

       
   } 
    
}
