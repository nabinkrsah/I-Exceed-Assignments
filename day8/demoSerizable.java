import java.io.*;
 
class employee implements Serializable
{
    String empname,desig;
    int empcode;
    double salary;
 
    employee(int empcode,String empname,String desig,double salary)
	{
	  this.empcode=empcode;
	  this.empname=empname;
	  this.desig=desig;
	  this.salary=salary;
	 }
}
 
class demoSerizable
{
    public static void main(String asd[]) throws Exception
	{
	   employee e1=new employee(1,"Rakesh","software engineer",120000);
	   ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(new File("mydataa.txt")));
	   os.writeObject(e1);
 
	   ObjectInputStream oi=new ObjectInputStream(new FileInputStream(new File("mydataa.txt")));
	   employee e=(employee)oi.readObject();
	   System.out.println("Name of the employee\t"+e.empname);
	   System.out.println("Employee code\t"+e.empcode);
	   System.out.println("Designation\t"+e.desig);
	   System.out.println("Salary\t"+e.salary);
 
 
	}
}
 