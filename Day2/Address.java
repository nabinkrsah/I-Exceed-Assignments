class Address {
    String street;
    String city;
    String state;
    String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public void displayAddress() {
        System.out.println(street + ", " + city + ", " + state + " - " + zipCode);
    }
}
