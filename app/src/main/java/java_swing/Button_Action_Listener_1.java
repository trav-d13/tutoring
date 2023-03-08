package java_swing;


import javax.swing.*;
import java.awt.event.*;

public class Button_Action_Listener_1 implements ActionListener
{
    int clicks = 0;
    JButton button;
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
