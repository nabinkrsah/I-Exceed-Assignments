import java.io.File;
 
class democreatefile
{
    public static void main(String asd[]) throws Exception
    // C:\Users\nabin.sah\Documents\newfiles
    // C:\Users\nabin.sah\Documents\newfiles
	{
	  File f=new File("c:/Users/nabin.sah/Documents/newfiles/sample.txt");
	  f.createNewFile();
	  System.out.println(f.isAbsolute());
	  System.out.println(f.getAbsolutePath());
	  boolean ex=f.exists();
	  System.out.println(ex);
	  if(ex)
		{
		   System.out.println("can Read?"+f.canRead());
		   System.out.println("can Write ?"+f.canWrite());
		}
 
	//   f.delete();
	//   System.out.println("is file is available?\t"+f.exists());
	}
}