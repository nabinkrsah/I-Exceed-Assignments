class demo extends Thread{
    Thread t=new Thread(this);

    public void run(){
        t.setName("NTS678");
        System.out.println("Thread Name is "+t.getName());
        System.out.println("this is Thread ");
    }
}

class demoThread1{
    public static void main(String[] args) {
        
        demo aa=new demo();
        aa.start();
        System.out.println("The name of the main Thread : "+Thread.currentThread().getName());
    }
    

}