class company1 {
    String nameofCompany;
    String City;
    company1(String nameofCompany, String City){
        this.nameofCompany=nameofCompany;
        this.City=City;
    }
    
}

class HR extends company1{
    
    HR(String nameofCompany,String City){
        super(nameofCompany,City);
        System.out.println("The name of the company in which hr is  ="+nameofCompany+"and city is "+City);

    }

}
class finance extends company1{
    finance(String nameofCompany, String City){
        super(nameofCompany,City);
        System.out.println("the name of the company is "+nameofCompany+ "City "+City);

    }

}

class company{
    public static void main(String[] args) {
        finance aa=new finance("i-exceed","bangalore");
        
    }
}