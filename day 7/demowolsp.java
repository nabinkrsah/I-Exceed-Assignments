abstract class bankaccount
{
    int accountnumber;
    double balance;
    abstract public void deposit(int amount);
    abstract public void withdraw(int amount);
    abstract public double getbalance();
}
 
class savingbankaccount extends bankaccount
{
    savingbankaccount(int accountnumber,double balance)	
	{
	   this.accountnumber=accountnumber;
	   this.balance=balance;
	}
 
    @Override
     public void deposit(int amount)
	{
	  balance+=amount;
	}
 
    @Override
     public void withdraw(int amount){
	  if(balance>amount)
	   {
	     balance-=amount;
	   }
	  else
            {
	       System.out.println("Insufficient balance");
	    }
	}
 
    @Override
     public double getbalance()
	{
	return balance;
	}
}
 
class fixedbankaccount extends bankaccount
{
    fixedbankaccount(int accountnumber,double balance)
	{
	  this.accountnumber=accountnumber;
	  this.balance=balance;
	}
 
    @Override
    public void deposit(int amount){balance+=amount;}
 
    @Override
    public void withdraw(int amount)
	{
  	   throw new UnsupportedOperationException("cannot withdraw before maturity");
	   // balance-=amount;
	}
 
    @Override
    public double getbalance()
	{
	  return balance;
	}
   }

 
  class demowolsp
   {
     public static void main(String asd[])
	{
	   bankaccount ba=new savingbankaccount(1,10000);
	   ba.deposit(1000);
	   System.out.println(ba.getbalance());
 
	   bankaccount fa=new fixedbankaccount(2,20000);
	   fa.deposit(1000);
	   System.out.println(fa.getbalance());
	   fa.withdraw(1000);
 
	
	} 
  }


