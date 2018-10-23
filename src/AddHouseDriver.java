import javax.swing.*;
import java.util.zip.DeflaterOutputStream;

public class AddHouseDriver {
    public static void main(String[] args) {

        House NewHouse = new House();

        NewHouse.setAddress(JOptionPane.showInputDialog("Enter Address for this house: \n"));
        NewHouse.setOwner(JOptionPane.showInputDialog("Enter the Owner's name for this house: \n"));
        NewHouse.setType(JOptionPane.showInputDialog("Enter Type of this house: \n"));

        double priceBV = Double.parseDouble(JOptionPane.showInputDialog("Enter the price for this house: \n"));

        if(priceBV < 0) {
            NewHouse.setPrice(NewHouse.getPrice());
        }
        else
            NewHouse.setPrice(priceBV);

        JOptionPane.showMessageDialog(null,NewHouse.toString(),"Details for: " + NewHouse.getType(),JOptionPane.INFORMATION_MESSAGE);
    }
}

