
class student{
    private String name, dept;
    private int roll_no;
    // student(String name, String dept,int roll_no){
    //     this.name=name;
    //     this.roll_no=roll_no;
    //     this.dept=dept;
    // }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
    public int getRoll(){
        return roll_no;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public void setRoll(int roll_no){
        this.roll_no=roll_no;
    }
}
    public class demo_encap {
        public static void main(String[] args){
            student sq=new student();
            sq.setName("Nabin");
            sq.setDept("cse");
            sq.setRoll(32);
            System.out.println(sq.getName());
            System.out.println(sq.getDept());
            System.out.println(sq.getRoll());
        }
    
}
