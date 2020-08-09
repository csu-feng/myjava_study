package swing_study;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class MyFrame extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    Date time = new Date();

    JButton btn = new JButton("btn");
    JLabel  lb  = new JLabel(String.format("%th", time));
    
    public MyFrame(String title){
        super(title);       //标题

        //内容面板
        java.awt.Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        contentPane.add(btn);
        contentPane.add(lb);
    }
}