class savingbankaccount{
    int balance;
    public void deposit(int amount){
        balance +=amount;
    }
    public void withdraw(int amount){
        if(balance > amount){
            balance -=amount;
        }
        else{
            System.out.println("Insuffcient Balanace");
        }
    }
    public double getbalance(){
        return balance;
    }
}

class currentaccount{
    int balance;
    public void deposit(int amount){
        balance +=amount;
    }
    public void withdraw(int amount){
        if(balance > amount){
            balance -=amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public double getbalance(){
        return balance;
    }
}
class bankservice{
    savingbankaccount sb=new savingbankaccount();
    currentaccount ca = new currentaccount();

    bankservice(){
        this.sb=sb;
        this.ca=ca;
    }
    public void depositetosaving(int amt){
        sb.deposit(amt);
    }
    public void withdrawfromsaving(int amt){
        sb.withdraw(amt);
    }
    public double getbalancefromsaving(){
        return sb.getbalance();
    }
    public void depositetocurrent(int amt){

        ca.deposit(amt);
    }
    public void withdrawfromcurrent(int amt){
        ca.withdraw(amt);
    }
}
public class demodi {
    public static void main(String[] args){
        bankservice bs=new bankservice();
        bs.depositetosaving(10000);
        bs.withdrawfromsaving(1000);
        System.out.println(bs.getbalancefromsaving());
    }
    
}
