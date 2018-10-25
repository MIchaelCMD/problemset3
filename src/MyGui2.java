import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// example of inheritance from a superclass
public class MyGui2 extends JFrame {

    public MyGui2(){
        setTitle("My Application");
        setSize(200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton jbutton = new JButton("Press Me");
        jbutton.addActionListener(new MyListener());
        Container jpane=getContentPane();
        jpane.add(jbutton);
    } //end constructor


    public static void main(String[] args) {
        MyGui2 mygui=new MyGui2();
        mygui.setVisible(true);
    } //end main

//inner class example implementing an Interface
public class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Hi there");

    } //end actionPerformed
} //end MyListener class

}//end class
