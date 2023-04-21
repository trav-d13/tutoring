package java_swing.button_action_listener_demo;

import javax.swing.*;

public class button_demo
{
    /**
     * Button action listener demonstration
     */
    public button_demo()
    {
        // Create the application Frame
        JFrame f = new JFrame("Java Swing Examples");

        // Add a button to the frame
        button_action_listener_1 button_al_1 = new button_action_listener_1();
        button_action_listener_2 button_al_2 = new button_action_listener_2();

        // Add two buttons using the two different methods
        JButton button_1 = button_al_1.addButton();
        JButton button_2= button_al_2.addButton();

        // Add button to the frame
        f.add(button_1); f.add(button_2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
