interface myinter1{
    public void display();
    default void display1(){
        System.out.println("Defalut method is called from interface1");
    }
}

interface myinter2 {
    default void display1(){
        System.out.println("Defalut method from interface2 ");
    } 
}
class sample implements myinter1,myinter2{
    @Override
    public void display(){
        System.out.println("display here");
    }
    public void display1(){
        System.out.println("inside defalut");
        myinter1.super.display1();
        myinter2.super.display1();
    }

}
public class demo_interface1 {
    public static void main(String[] args){
        sample obj = new sample();
        obj.display();
        obj.display1();
    }
    
}
