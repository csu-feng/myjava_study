import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import af.swing.layout.AfAnyWhere;
import af.swing.layout.AfMargin;

import java.awt.*;

public class AfAnyWhereTest{
    public static void main(String[] args) {
        myframe frame = new myframe();

        frame.setSize(400, 200);
    }
}

class myframe extends JFrame{ 
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public myframe() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Container root = getContentPane();
        root.setLayout(new AfAnyWhere());

        ColorLabel label1 = new ColorLabel("红色", Color.RED);
        ColorLabel label2 = new ColorLabel("蓝色", Color.BLUE);
        ColorLabel label3 = new ColorLabel("黄色", Color.YELLOW);

        Border bo1 = new LineBorder(Color.BLACK, 5);
        label1.setBorder(bo1);
        Border bo2 = BorderFactory.createDashedBorder(Color.PINK, 15f, 10);
        label3.setBorder(bo2);

        label3.setPreferredSize( new Dimension( 100,  100) );

        //AfMargin(top, left, below, right),上左下右的距离
        root.add(label1, new AfMargin(0, 0, -1, -1));
        root.add(label2, new AfMargin(0, -1, -1, 0));
        root.add(label3, new AfMargin(-1, -1, -1, -1));
        
    }
}

class ColorLabel extends JLabel{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ColorLabel(String str, Color color) {
        super(str);
        setOpaque(true);
        setBackground(color);
    }
}