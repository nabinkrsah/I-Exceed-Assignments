class Address
 {
    int plotno,pin;
    String st,city;
 
      Address(String st,String city,int plotno,int pin)
        {
            this.plotno=plotno;
            this.pin=pin;
            this.st=st;
            this.city=city;
        }
     public void displayAddress()
     {
        System.out.println("Plot"+plotno);
        System.out.println("Street"+st);
        System.out.println("City"+city);
        System.out.println("Pincode"+pin);
     }
 }