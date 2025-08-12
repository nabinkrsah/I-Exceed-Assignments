interface iaccount {
    public void deposit(int amt);
    public void withdraw(int amt);
    public double getbalance();  
}

class savingbankaccount implements iaccount{
    double balance=10000;
    @Override
    public void deposit(int amt){
        balance +=amt;
    }
    @Override
    public void withdraw(int amt){
        balance -=amt;
    }
    @Override
    public double getbalance(){
        return balance;
    }
}

class currentaccount implements iaccount{
    double balance=20000;
    @Override
    public void deposit(int amt){
        balance +=amt;
    }
    @Override
    public void withdraw(int amt){
        balance -=amt;
    }
    @Override
    public double getbalance(){
        return balance;
    }

}

class businessaccount implements iaccount{
    double balance;
    @Override
    public void deposit(int amt){
        balance +=amt;
    }
    @Override
    public void withdraw(int amt){
        balance -=amt;
    }
    @Override
    public double getbalance(){
        return balance;
    }
}

class bankservice{
    iaccount iac;
    bankservice(iaccount iac){
        this.iac=iac;
    }
    public void processdeposit(int amt){
        iac.deposit(amt);
    }
    public void processwithdraw(int amt){
        iac.withdraw(amt);
    }
    public double processbalance(){
        return iac.getbalance();
    }
}
public class demowdip {
    public static void main(String[] args){
        bankservice bs=new bankservice(new currentaccount());
        bs.processdeposit(1000);
        bs.processwithdraw(100);
        System.out.println(bs.processbalance());
    }
    
}
