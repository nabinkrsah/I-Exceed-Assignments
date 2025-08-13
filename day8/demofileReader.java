import java.io.FileReader;

import java.io.File;
import java.io.FileInputStream;
public class demofileReader {
    public static void main(String[] asd) throws Exception{
        try{    
            FileInputStream fin=new FileInputStream("sample.txt");    
            int i=0; 

            while((i=fin.read())!=-1)
		{
	   	   System.out.print((char)i);
		}
           
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
    }
    
}
