public class RecPerCons {
    int l,w,area;
    
    RecPerCons()  {
        l=10;
        w=20;
    }
    void showArea(){
        area=l*w;
        System.out.println("area="  +area);
    }
    RecPerCons(int l,int w)
    {
        this.l=l;
        this.w=w;
    }
    public static void main(String[] args) {
        RecPerCons r1=new RecPerCons(5,7);
        RecPerCons r2=new RecPerCons(6,7);
        r1.showArea();
    }
}
