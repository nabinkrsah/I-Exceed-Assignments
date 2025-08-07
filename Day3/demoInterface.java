interface one{
    public void methodfromone();
}
interface two extends one{
    public void methodfromtwo();
}

class sample implements two{
    sample()
	{
 
	}
    @Override
     public void methodfromone(){
	 System.out.println("method from interface one");
	}
 
    @Override
     public void methodfromtwo(){
	System.out.println("method from interface two");
	}
}
public class demoInterface {
    public static void main(String[] args) {
        sample aa=new sample();
        aa.methodfromone();
        aa.methodfromtwo();
    }
    
}
