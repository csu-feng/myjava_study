import javax.swing.*;

import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;

public class SimpleGuilB implements ActionListener{
    JButton button;
    public static void main(String[] args){
        SimpleGuilB gui = new SimpleGuilB();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click me");
        MyDrawPanel mypanel = new MyDrawPanel();

        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//按右上角x结束程序运行
        //frame.getContentPane().add(button);
        frame.getContentPane().add(mypanel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I'v been clicked!");
        System.out.println(e);
    }
}

class MyDrawPanel extends JPanel{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void paintComponent(Graphics g) {
        //g.setColor(Color.red);

        //g.fillRect(20, 50, 100, 100);

        Image image = new ImageIcon("illust_34993759_20190314_151531.jpg").getImage();
        
        g.drawImage(image, 3, 4, this);
    }
}
