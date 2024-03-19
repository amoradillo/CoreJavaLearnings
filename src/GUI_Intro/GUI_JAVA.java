package GUI_Intro;

import javax.swing.JOptionPane;

    // There is a one issue though when you use a show input dialog box it's going to return a string
    // We are attempting to assign the string into an integer. The solution we could convert into integer.
    // We are going to use Integer.parseInt to convert it to integer
    //


public class GUI_JAVA {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your Name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "you are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"You are " + height + " cm tall");


    }
}
