class sample{
    int x=10;
    static int y=20;
    public void display(){
        System.out.println("x= "+x+" y= "+y);
    }
    static void display1(){
        // sample nn=new sample();
        // System.out.println("x= "+nn.x);
        System.out.println("x= "+new sample().x);
        System.out.println("y= "+y);
    }
}

public class demoStaticVar {
    public static void main(String[] args) {
        sample aa=new sample();
        aa.display();
        sample.display1();
    }
    
}
