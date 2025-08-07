interface one{
    static void display(){
        System.out.println("inside the static method ");
    }
    public void show();
}

class sample implements one {
    sample(){
        System.out.println("inside the constructor");
    }
    @Override
    public void show(){
        System.out.println(("Inside the show"));
    }
}

public class demoInterface2 {
    public static void main(String[] args) {
        sample obj = new sample();
        obj.show();
        one.display();
    }
    
}
