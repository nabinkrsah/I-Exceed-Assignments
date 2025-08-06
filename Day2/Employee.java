class emp{
    int id;
    String name;
    Address1 add;

    public emp(int id, String name, Address1 add){
        this.id=id;
        this.name=name;
        this.add=add;
    }

    public void display(){
        System.out.println("the id is "+id+ "and the name is "+name);
        System.out.println("the city is "+add.city+" state is "+add.state+"and the country is "+add.country);
    }
}

public class Employee {
    public static void main(String[] args) {
        Address1 bb=new Address1("bangalore","karnataka","India");
        emp aa=new emp(23,"Nabin",bb);
        aa.display();
        Address1 cc=new Address1("chennai", "tamil nadu", "India");
        emp kk=new emp(56,"kiran",cc);
        kk.display();
        
    }
    
}
