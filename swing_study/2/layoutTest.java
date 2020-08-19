//package swing_study;
import javax.swing.*;
import java.awt.*;


class MFrame extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JLabel obj = new JLabel("hello");

    public MFrame(String title) {
        super(title); // 标题

        // 内容面板
        Container contentPane = getContentPane();
        contentPane.setLayout(new MyLayout()); 
        contentPane.add(obj);
    }

    private class MyLayout extends SimpleLayout
    {
        @Override
        public void layoutContainer(Container parent){
        
            int w = parent.getWidth();
            int h = parent.getHeight();

            Dimension size = obj.getPreferredSize();

            int x = (w - size.width) / 2;
            int y = (h - size.height) / 2;
            obj.setBounds(x, y, size.width, size.height);
        }
    
    }
    
}

public class layoutTest {
    public static void main(String[] args){
        JFrame frame = new MFrame("hello");

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}