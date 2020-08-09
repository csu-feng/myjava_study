package swing_study;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Calendar;

public class MyFrame extends JFrame {
    
    private static final long serialVersionUID = 1L;

    Calendar cal = Calendar.getInstance();// 调用静态方法获得Calendar子类
    String time = cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND);

    JButton btn = new JButton("更新时间");
    JLabel lb = new JLabel(String.format(time));

    private btnlistener btnl = new btnlistener();

    public MyFrame(String title) {
        super(title); // 标题

        // 内容面板
        java.awt.Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        contentPane.add(btn);
        contentPane.add(lb);
        btn.addActionListener(btnl);
        
    }

    //更新时间
    public void showTime(){
        System.out.println("执行showTime");
        Calendar ca = Calendar.getInstance();
        time = ca.get(Calendar.HOUR_OF_DAY) + ":" + ca.get(Calendar.MINUTE) + ":" + ca.get(Calendar.SECOND);
        lb.setText(time);
    }

    //监听器
    private class btnlistener implements ActionListener {

        @Override
        //按钮按下后调用此方法
        public void actionPerformed(ActionEvent e) {
            System.out.println("按钮按下");// TODO Auto-generated method stub
            MyFrame.this.showTime();
        }
        
    }
}