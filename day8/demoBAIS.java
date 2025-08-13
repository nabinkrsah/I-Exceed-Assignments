import java.io.ByteArrayInputStream;
class demoBAIS
   {
     public static void main(String asd[])
	{
	    byte x[]={65,66,67,68,69,70};
	    ByteArrayInputStream bis=new ByteArrayInputStream(x);
	    //System.out.println((char)bis.read());
	    System.out.println(bis.available());
 
	     int i=0;
 
		while((i=bis.read())!=-1)
		  {
   		     System.out.println((char)i);
		  }
	 System.out.println(bis.available());
 
 
	}
  }