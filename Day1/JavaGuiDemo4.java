package com.ff.javgui.Day1;

import javax.swing.*;
import java.awt.*;

public class JavaGuiDemo4 extends JFrame {
    public static void main(String[] args) {
        JavaGuiDemo4 jf = new JavaGuiDemo4();
        jf.setFrame();
        jf.setVisible(true);
    }

    public void setFrame(){
        this.setSize(500,500);//设置窗口大小
        setTitle("GUI窗口");//设置窗口标题
        setLocationRelativeTo(null);//设置位置,窗口水平垂直居中
        setResizable(false);//窗口大小不能改变
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口,退出程序

        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        JLabel jl =new JLabel("账户");
        jl.setText("账户");
        jl.setFont(new Font("楷体",Font.BOLD,20));
        jp.add(jl);

        //单行文本框组件
        JTextField jt = new JTextField("文本框中设置的内容",15);
        System.out.println(jt.getText());
        jp.add(jt);

        JLabel jl1 = new JLabel("密码");
        jp.add(jl1);
        JPasswordField jPasswordField = new JPasswordField("123",15);
        String s = String.valueOf(jPasswordField.getPassword());
        System.out.println(s);
        jp.add(jPasswordField);

        this.add(jp);

    }
}
