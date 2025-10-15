
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class nikita{
    public static void main(String[] args) {
        try{
        FileInputStream fin = new FileInputStream("text.txt");
        
        FileOutputStream fout = new FileOutputStream("text.txt",true);
        int ch;
        if ((ch = fin.read())!=-1) {
            // System.out.println((char)ch);
            // System.out.println("this is added part");
            fout.write("this is added part".getBytes());
            fout.write((char)ch);

        }
        fin.close();
        System.out.println("created successfully");
        fout.close();
        }catch(IOException e){
            System.out.println(e.getMessage());

            
        }

    }
}