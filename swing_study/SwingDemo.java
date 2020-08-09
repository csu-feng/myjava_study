package swing_study;

import java.awt.*;
import javax.swing.*;

public class SwingDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("我的swing demo");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}