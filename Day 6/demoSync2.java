class call
{
  synchronized  public void callme(String msg)
	{
          System.out.print("[");
	  System.out.print(msg);
	  System.out.print("]");
	  display();
	}
 
     public void display()
	{
	  for(var i=0;i<10;i++)
	 	System.out.print(i);
	}
  }
 
 
class caller extends Thread
{
    call obj;
    String str;
    Thread t=new Thread(this);
 
    caller(call obj,String str)
	{
	   this.str=str;
	   this.obj=obj;
	   t.start();
	}
 
    public void run()
	{
	   obj.callme(str);
	}
}
 
class demoSync2
{
    public static void main(String asd[]) throws Exception 
	{
	   call obj=new call();
    	   caller c1=new caller(obj,"one");
	   c1.join();
	   caller c2=new caller(obj,"two");
	   c2.join();
	   caller c3=new caller(obj,"three");
 
	 
   	}
  }
