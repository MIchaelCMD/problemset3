import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// example of inheritance from a superclass and an Interface
public class MyGui extends JFrame implements ActionListener {

    public MyGui(){
        setTitle("My Application");
        setSize(200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton jbutton = new JButton("Press Me");
        jbutton.addActionListener(this);
        Container jpane=getContentPane();
        jpane.add(jbutton);
    } //end constructor


    public static void main(String[] args) {
        MyGui mygui=new MyGui();
        mygui.setVisible(true);
    } //end main



    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Hi there");

    } //end actionPerformed


}//end class
