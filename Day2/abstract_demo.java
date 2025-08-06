abstract class abstract_d {
    public void display(){
        System.err.println("hello");
    }
    abstract void display1();
    abstract void display2();  
}

class abstract_demo extends abstract_d{
    public void display1(){
        System.out.println("inside display1");
    }
    public void display2(){
        System.err.println("Inside display2");
    }
public static void main(String[] args){
    abstract_demo aa=new abstract_demo();
    aa.display();
    aa.display1();
    aa.display2();

}
}
