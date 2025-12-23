
import java.util.Comparator;
import java.util.TreeSet;



class product11
{
   private String pname;
   private double price;
   private String compnyname;
   public  product11()
   {
	   super();
   }
public product11(String pname, double price, String compnyname) {
	super();
	this.pname = pname;
	this.price = price;
	this.compnyname = compnyname;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getCompnyname() {
	return compnyname;
}
public void setCompnyname(String compnyname) {
	this.compnyname = compnyname;
}
@Override
public String toString() {
	return  pname +price +compnyname ;
}
}  

 class productcmp implements Comparator
{
//unimplement method	

	@Override
	public int compare(Object obj1, Object obj2) {
		//type cast
	  product11 p1=(product11)obj1;
	  product11 p2=(product11)obj2;
	double diff=(Double)(p2.getPrice()-p1.getPrice());
	
	  if(diff==0)
	  {
		  diff=p1.getPname().compareTo(p2.getPname());
	  }
		  return (int) diff;
	}
	
	
}
public class productdemo {

	public static void main(String[] args) {
		productcmp cmp=new productcmp(); 
		
		TreeSet<product11> ts= new TreeSet<>(cmp);
		ts.add(new product11("router",500.0,"airtel"));
		ts.add(new product11("router",500.0,"jio"));
		ts.add(new product11("keyboard",800,"dell"));
		ts.add(new product11("modem",400.00,"jio"));
		System.out.println(ts);   
	}

}
