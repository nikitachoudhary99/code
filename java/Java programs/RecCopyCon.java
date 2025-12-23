
public class RecCopyCon {

    int l,w,area;
    RecCopyCon()
    {
        l=20;
        w=30;
    }
    void showArea()
    {
        area=l*w;
        System.out.println("area="+area);
    }
    RecCopyCon(int l,int w)
    {
        this.l=l;
        this.w=w;
        showArea();
    }



        public static void main(String[] args){

        RecCopyCon r1= new RecCopyCon();
        r1.showArea();
        RecCopyCon r2= new RecCopyCon();
        }
    
}

