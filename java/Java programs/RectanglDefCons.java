public class RectanglDefCons {

      
    int l,w,area;
    public RectanglDefCons()
    {
      l=10;
      w=20;
    }
    void showArea()
    {
      area=l*w;
      System.out.print(" area = "   +area);

    }
    public static void main(String [] args){
    RectanglDefCons R1 = new RectanglDefCons();
    RectanglDefCons r2=new RectanglDefCons();
    R1.showArea();
  }
  

    
}
