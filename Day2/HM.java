package com.ff.javgui.Day2;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HM extends JFrame {
    public static void main(String[] args) {
        HM jf = new HM();
        jf.setFrame();
        jf.setVisible(true);
    }

    public void setFrame() {
        setSize(460, 300);//设置窗口大小
        setTitle("聊天窗口");//设置窗口标题
        setLocationRelativeTo(null);//设置位置,窗口水平垂直居中
        setResizable(false);//窗口大小不能改变
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口,退出程序


        JPanel jp = new JPanel(new GridLayout(4, 1));

        JPanel jp1 = new JPanel();
        JLabel jb13 = new JLabel("欢迎登录");
        jb13.setFont(new Font("楷体", Font.CENTER_BASELINE, 35));
        jp1.add(jb13);

        JPanel accJp = new JPanel();
        JLabel accLable = new JLabel("账户");
        JTextField accText = new JTextField(15);
        accLable.setFont(new Font("楷体", FlowLayout.CENTER, 20));
        accJp.add(accLable);
        accJp.add(accText);


        JPanel pasJp = new JPanel();
        JLabel jl1 = new JLabel("密码");
        jl1.setFont(new Font("楷体", FlowLayout.CENTER, 20));
        JPasswordField jPasswordField = new JPasswordField("", 15);
        pasJp.add(jl1);
        pasJp.add(jPasswordField);

        JPanel btnPanel = new JPanel();
        JButton loginBtn  = new JButton("登录");
        JButton regBtn  = new JButton("注册");
        btnPanel.add(loginBtn);
        btnPanel.add(regBtn);

        jp.add(jp1);
        jp.add(accJp);
        jp.add(pasJp);
        jp.add(btnPanel);

        this.add(jp);

        //为登录按钮添加监听器
        loginBtn.addActionListener(new AbstractAction() {//匿名内部类
            @Override
            public void actionPerformed(ActionEvent e) {
                String account = accText.getText();
                String passWord = String.valueOf(jPasswordField.getPassword());
                //验证操作
                if (account.length()==0){
                    JOptionPane.showMessageDialog(null,"请输入密码");
                    return;
                }
                if (passWord.length()==0){
                    JOptionPane.showMessageDialog(null,"请输入密码");
                }
                System.out.println(account);
                System.out.println(passWord);
            }
        });

    }
/*内部类
    class D implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }*/
}
