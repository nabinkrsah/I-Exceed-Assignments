class sample{
    String name, dept;
    int age;
    sample(String name, int age, String dept){
        this.name=name;
        this.age=age;
        this.dept=dept;
    }
    public void displayStudent(){
        System.out.println("Name="+name);
        System.out.println(("age="+age));
        System.err.println("dept="+dept);
    }
}

class teacher extends sample{
teacher(String name, int age, String dept){
    super(name,age,dept);
    System.out.println("the name of the students is "+name + " ad his age is " +age);

}
}
public class second {
    public static void main(String[] args){
        teacher aa=new teacher("Nabin",25,"CSE");

    }
    
}
