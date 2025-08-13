import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
 
class demodiscom2
{
   public static void main(String asd[]) throws Exception
	{
           File f=new File("sample2.txt");
	   FileOutputStream fout=new FileOutputStream(f);
	   DataOutputStream dout=new DataOutputStream(fout);
 
	   dout.writeInt(12);
	   dout.writeBoolean(true);
	   dout.writeDouble(23.43);	
	   dout.close();
 
	   DataInputStream din=new DataInputStream(new FileInputStream(f));
   	   System.out.println(din.readInt());	   
	   System.out.println(din.readBoolean());	   
           System.out.println(din.readDouble());  

	}
}