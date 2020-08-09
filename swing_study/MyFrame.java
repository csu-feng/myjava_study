package swing_study;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JButton btn = new JButton("btn");
    JLabel  lb  = new JLabel("label content");
    
    public MyFrame(String title){
        super(title);       //标题

        //内容面板
        java.awt.Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        contentPane.add(btn);
        contentPane.add(lb);
    }
}