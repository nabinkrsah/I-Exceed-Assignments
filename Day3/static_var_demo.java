public class static_var_demo {
     static int x;
 
    static_var_demo()
	{
	   x++;
	   System.out.println(x);
	}
 
    public static void main(String asd[])
	{
	   static_var_demo obj1=new static_var_demo();
	   static_var_demo obj2=new static_var_demo();
	   static_var_demo obj3=new static_var_demo();
	}
    
}
