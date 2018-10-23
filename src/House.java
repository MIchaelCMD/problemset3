public class House {

    String address,owner, type;
    double price;

    public House() {

        price = 0.0;
        address  = "No Address";
        type = "No Type";
        owner = "No Owner";

    }

    public House(String address, String owner, String type, double price) {

        this.address = address;
        this.owner = owner;
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

        this.owner = owner;
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getAddress() {

        return address;
    }

    public String getOwner() {

        return owner;
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
