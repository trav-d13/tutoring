package java_swing;




/*
 * This Java source file was generated by the Gradle 'init' task.
 */


import javax.swing.*;

public class App {

    public static void main(String[] args)
    {
        // Create the application Frame
        JFrame f = new JFrame("Java Swing Examples");

        // Add a button to the frame
        Button_Action_Listener_1 button_al_1 = new Button_Action_Listener_1();
        Button_Action_Listener_2 button_al_2 = new Button_Action_Listener_2();

        JButton button_1 = button_al_1.addButton();
        JButton button_2= button_al_2.addButton();

        // Add button to the frame
        f.add(button_1); f.add(button_2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }


}