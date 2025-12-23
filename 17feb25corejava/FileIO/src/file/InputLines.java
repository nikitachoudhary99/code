package file;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class InputLines 
{

	public static void main(String[] args) 
	{
		
		try 
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter a line:");
			String s = br.readLine();
			System.out.println(s);	
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		

	}

}
