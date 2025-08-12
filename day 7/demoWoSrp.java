//violates the Single Responsibility Principle
class BankAccount
 {
      private String accountNumber;
      private String accountHolder;
      private double balance;

    public BankAccount(String accountNumber,String accountHolder,double balance) {
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;

    }

    public void deposite(double amount)
     {
        balance+=amount;
        System.out.println("Deposited "+amount);
        System.out.println("Balance After Deposite"+balance);
    
     }

     public void withdraw(double amount)
      {
        if (balance>amount)
        {
            balance-=amount;
            System.out.println("withdraw"+amount);
            System.out.println("Balance Amount after withdraw"+balance);
        }   
        else{
            System.out.println("Insufficient Balance");
        }
      }

      public void printAccount()
      {
        System.out.println("Accounts Details");
        System.out.println("Account Number"+accountNumber);
        System.out.println("AccountHolder Name"+accountHolder);
        System.out.println("Balance"+balance);
      }

      public void savetoFile()
      {
        System.out.println("Logic for save to File here");
      }
      
 }

 class demoWoSrp
  {
    public static void main(String asd[])
        {
           BankAccount obj= new BankAccount("2353","Nabin",120000);
           obj.deposite(10000);
           obj.withdraw(60000);
           obj.printAccount();
           obj.savetoFile();
         
        }
  }


