package java_swing.button_action_listener_demo;

import javax.swing.*;
import java.awt.event.*;

public class button_action_listener_1 implements ActionListener
{
    int clicks = 0;
    JButton button;

    /**
     * Two method button action listener creation
     * This method offers a cleaner, OOP alternative to option 2
     */
    public JButton addButton()
    {
        button = new JButton("Add");
        button.setBounds(100, 100, 90, 30);
        button.addActionListener(this);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        clicks ++;
        System.out.println("Button action listener 1 clicks: " + clicks);
    }
}
