import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

class sample{
    sample(){

    }
    public void display(){
        System.err.println("I am in super class");
    }
}
class sample1 extends sample{
    sample1(){

    }
    public void display(){
        System.out.println("this is in derived class");
    }

}

public class demo_overide {
    public static void main(String[] args) {
        sample ref;
        sample aa=new sample();
        sample1 bb=new sample1();
        ref=bb;
       ref.display();
        
    }
    
}
