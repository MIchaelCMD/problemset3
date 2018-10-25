import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// example of inheritance from a superclass
public class MyGui4 extends JFrame {

    public MyGui4(){
        setTitle("My Application");
        setSize(200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton jbutton = new JButton("Press Me");

        //example of an anonymous inner class
        jbutton.addActionListener((ActionEvent e)->
                {
                JOptionPane.showMessageDialog(null, "Hi there");
            }
        );
        Container jpane=getContentPane();
        jpane.add(jbutton);
    } //end constructor


    public static void main(String[] args) {
        MyGui3 mygui=new MyGui3();
        mygui.setVisible(true);
    } //end main


}//end class
