
class sample2 extends Thread{
    Thread t2=new Thread(this);
    public void run(){
        for(int i=0;i<10;i++){
            try{
                System.out.println(i);
                t2.sleep(100);
            }catch(InterruptedException d){}
        }
        this.display();
    }
    public void display(){
        for(var i=10;i<21;i++){
            System.out.println(i);
        }

    }

}
public class demoThread4 {
    public static void main(String[] args) {
        sample2 s1=new sample2();
        s1.start();

    }
    
}
