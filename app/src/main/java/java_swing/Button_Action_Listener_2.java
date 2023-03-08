package java_swing;


import javax.swing.*;
import java.awt.event.*;

public class Button_Action_Listener_2
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
