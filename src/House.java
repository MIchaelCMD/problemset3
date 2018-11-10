public class House {

    private String address, type;
    private double price;
    private Person owner;

    public House() {
        //blank constructor with default values
        price = 0.0;
        address  = "No Address Specified";
        type = "No Type Specified";
        owner = new Person();      //Creating instance of Person

    }

    public House(String address, String owner, String type, double price) {

        this.address = address;
        this.owner = new Person(owner);   //Creating instance of Person with a name owner
        this.type = type;
        this.price = price;

    }

    public void setPrice(double price) {

        this.price = price;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void setOwner(String owner) {

        this.owner = new Person(owner);
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getAddress() {

        return address;
    }

    public Person getOwner() {

        return owner; //returning Person
    }

    public double getPrice() {

        return price;
    }

    public String getType() {

        return type;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ":\nOwner: " + getOwner() + "\nAddress: " + getAddress() + "\nPrice: " + getPrice();
    }
}
