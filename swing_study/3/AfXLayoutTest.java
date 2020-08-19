import java.awt.*;
import javax.swing.*;
import af.swing.layout.*;


public class AfXLayoutTest {
    public static void main(String[] args) {
        myframe frame = new myframe();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}

class myframe extends JFrame{
   
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    Container contentPane = getContentPane();
    public myframe(){
        super();
        contentPane.setLayout(new AfYLayout());

        JLabel a1 = new JLabel("a");
        JLabel a2 = new JLabel("b");

        a1.setOpaque(true);
        a1.setBackground(Color.CYAN);
        a2.setOpaque(true);
        a2.setBackground(Color.CYAN);

        contentPane.add(a1, "50px");
        contentPane.add(a2, "auto");
    }
}