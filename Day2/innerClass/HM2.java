package com.ff.javgui.Day2.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HM2 extends JFrame {
    public static void main(String[] args) {
        HM2 jf = new HM2();
        jf.setFrame();
        jf.setVisible(true);
    }

    JTextField txt;

    public void setFrame() {
        setSize(460, 300);//设置窗口大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口,退出程序

        txt = new JTextField(20);
        JPanel jp = new JPanel(new GridLayout(4, 1));
        JPanel btnPanel = new JPanel();
        JButton loginBtn = new JButton("登录");
        btnPanel.add(loginBtn);
        jp.add(btnPanel);
        this.add(jp);

        //为登录按钮添加监听器
        loginBtn.addActionListener(new DListner());

    }

    //成员内部类
    class DListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            txt.getText();
        }
    }
}
