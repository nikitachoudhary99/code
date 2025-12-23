interface square{
    int square1(int x);
}
public class nikita2n {
    public static void main(String[] args) {
        square s=(int x)->{
            return x*x;
        };
        System.out.println(s.square1(6));
    }
    } 