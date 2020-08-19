package swing_study;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Calendar;

public class MyFrame extends JFrame {
    
    private static final long serialVersionUID = 1L;

    // 调用静态方法获得Calendar子类
    Calendar cal = Calendar.getInstance();
    String time = cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND);

    JButton btn = new JButton("更新时间");
    JLabel lb = new JLabel(String.format(time));

    private btnlistener btnl = new btnlistener();

    //构造函数
    public MyFrame(String title) {
        super(title); // 标题

        // 内容面板
        java.awt.Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        contentPane.add(btn);
        contentPane.add(lb);
        btn.addActionListener(  (e)->{
            System.out.println("hello");
        } );

        //JOptionPane.showMessageDialog(this, "hello world!");
        
    }

    //更新时间
    private void showTime(){
        System.out.println("执行showTime");
        Calendar ca = Calendar.getInstance();
        time = ca.get(Calendar.HOUR_OF_DAY) + ":" + ca.get(Calendar.MINUTE) + ":" + ca.get(Calendar.SECOND);
        lb.setText(time);
    }

    //弄个Java消息提示框
    private void showMess(){
        JOptionPane.showMessageDialog(this, "hello world!");
    } 

    //监听器
    private class btnlistener implements ActionListener {

        @Override
        //按钮按下后调用此方法
        public void actionPerformed(ActionEvent e) {
            System.out.println("按钮按下");// TODO Auto-generated method stub
            MyFrame.this.showTime();
            MyFrame.this.showMess();
        }
        
    }
}