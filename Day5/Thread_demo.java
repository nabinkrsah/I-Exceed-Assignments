class sample extends Thread
{
    public void run()
	{
	  for(var i=0;i<10;i++)
	   {
	     try{
	      System.out.println(i);
	      new Thread(this).sleep(1000);
	     }catch(Exception d){}
	   }
 
	}
}
 
class Thread_demo
{
    public static void main(String ads[]) throws InterruptedException
	{
	   sample obj=new sample();
	   obj.start();
	   for(var i=0;i<10;i++)
		{	
		   System.out.println("main\t"+i);
		   Thread.currentThread().sleep(1000);
		}
 
	}
}