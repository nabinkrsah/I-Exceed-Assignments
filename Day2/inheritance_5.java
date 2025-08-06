class car{
    String nameofCompany;
    boolean isAvailable;

    car(String nameofCompany,boolean isAvailable){
        this.nameofCompany=nameofCompany;
        this.isAvailable=isAvailable;
    }

    public void getCarDetails(){
        System.out.println(nameofCompany);
        System.out.println(isAvailable);
    }
}
class scorpio extends car{
    String carName,modelName , color;
    scorpio(String carName, String modelName, String color){
        super("Mahindra",true);
        this.carName=carName;
        this.modelName=modelName;
        this.color=color;

    }
    public void displayCarModel(){
        System.out.println("Name of the car : "+carName);
        System.out.println("Modal : "+modelName);
        System.out.println("Color : " +color);
    }
}
public class inheritance_5 {
    public static void main(String[] args){
        scorpio aa=new scorpio("BMW", "B12", "Red");
        aa.getCarDetails();
        aa.displayCarModel();
    }
    
}
