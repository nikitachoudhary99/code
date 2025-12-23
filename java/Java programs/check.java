


public class check {
    public static void main(String[] args) {
        int a,b;
        if(args.length==2)
        {
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            System.out.println("addition is"+(a+b));

        }
        else{
            System.out.println("invalid argunment");
        }
    }
}
