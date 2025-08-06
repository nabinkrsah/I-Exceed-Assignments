
class Employee {
    int id;
    String name;
    Address address; 

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.print("Address: ");
        address.displayAddress(); 
    }
}

public class Main {
    public static void main(String[] args) {
        Address addr = new Address("123 MG Road", "Bangalore", "Karnataka", "560001");
        Employee emp = new Employee(101, "Rahul Sharma", addr);
        emp.displayEmployee();
    }
}
