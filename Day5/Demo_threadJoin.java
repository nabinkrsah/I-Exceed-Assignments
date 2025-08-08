class sample1 extends Thread{
    Thread t1=new Thread(this);
    public void run(){
        for(int i=0;i<10;i++){
            try{
                System.out.println(i);
                t1.sleep(2000);

            }catch(InterruptedException d){}
        }
    }
}

public class Demo_threadJoin {
    public static void main(String[] args) throws InterruptedException {
    sample1 a1=new sample1();
    sample1 a2=new sample1();
    sample1 a3 = new sample1();
    a1.start();
    a1.join();
    a2.start();
    a2.join();
    a3.start();
    a3.join();
    }
    
}
