public class demoblock {

    //static block
    static{
        System.err.println("inside static block");
    }
    //constructor
    demoblock(){
        System.out.println("inside costructor");
    }
    //instance block
    {
        System.err.println("instance block is called");
    }
    public static void main(String[] sargs){
        demoblock aa=new demoblock();
        //main block
        System.err.println("Inside the main method");
    }
    
}
