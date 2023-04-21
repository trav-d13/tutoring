package java_swing.button_action_listener_demo;

import javax.swing.*;
import java.awt.event.*;

/**
 * Single method button action listener creation
 * Great for creating the button-action for a single purpose in the same location within the code
 */
public class button_action_listener_2
{
    int clicks = 0;
    JButton button;

    public JButton addButton()
    {
        button = new JButton("Add");
        button.setBounds(100, 200, 90, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicks ++;
                System.out.println("Button action listener 2 clicks: " + clicks);
            }
        });
        return button;
    }
}
