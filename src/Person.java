/**
 * Created by T00036644 on 31/10/2017.
 */
public class Person {
    private String name;
    private String address;

    public Person() {

        this("No Owner Specified","Unknown");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nName: "+ name  +"\n" +
                "Address: " + address;   //Address is running twice in output for house (null then actual value)
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
