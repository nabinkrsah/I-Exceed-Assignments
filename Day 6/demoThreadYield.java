class one extends Thread{
    public void run(){
        for(var i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"iteration"+i);
        }
    }
}

public class demoThreadYield {
    public static void main(String[] args) {
        one obj1=new one();
        obj1.start();
        // obj1.yield();
        for(var i=0;i<10;i++){
            System.out.println("Main thread running");
        }
    }
    
}
